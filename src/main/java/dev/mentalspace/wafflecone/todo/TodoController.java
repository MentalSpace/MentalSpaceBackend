package dev.mentalspace.wafflecone.todo;

import dev.mentalspace.wafflecone.Utils;
import dev.mentalspace.wafflecone.WaffleConeController;
import dev.mentalspace.wafflecone.auth.AuthToken;
import dev.mentalspace.wafflecone.auth.AuthScope;
import dev.mentalspace.wafflecone.auth.AuthTokenService;
import dev.mentalspace.wafflecone.auth.RefreshToken;
import dev.mentalspace.wafflecone.auth.RefreshTokenService;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import dev.mentalspace.wafflecone.response.ErrorResponse;
import dev.mentalspace.wafflecone.response.ErrorString;
import dev.mentalspace.wafflecone.response.Response;
import dev.mentalspace.wafflecone.user.User;
import dev.mentalspace.wafflecone.user.UserService;
import dev.mentalspace.wafflecone.user.UserType;
import dev.mentalspace.wafflecone.work.WorkService;

@RestController
@RequestMapping(path = { "/api/v0/todo" })
public class TodoController {
    @Autowired
	UserService userService;
	@Autowired
	RefreshTokenService refreshTokenService;
	@Autowired
	AuthTokenService authTokenService;
    @Autowired
    TodoService todoService;
    @Autowired
    WorkService workService;
    
    @GetMapping(path = "", consumes = { MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<String> getTodo(@RequestHeader("Authorization") String authApiKey, 
            @RequestParam(value = "todoId", defaultValue = "-1") Long searchTodoId) {
		AuthToken authToken = authTokenService.verifyBearerKey(authApiKey);
		if (!authToken.valid) {
			JSONObject errors = new JSONObject().put("accessToken", ErrorString.INVALID_ACCESS_TOKEN);
			return ResponseEntity.status(HttpStatus.FORBIDDEN).body(new ErrorResponse(errors).toString());
		}
		User loggedInUser = userService.getById(authToken.userId);

        if (!todoService.existsById(searchTodoId)) {
            JSONObject errors = new JSONObject().put("todoId", ErrorString.INVALID_ID);
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new ErrorResponse(errors).toString());
        }

        Todo todo = todoService.getById(searchTodoId);
        Response response = new Response("success").put("work", todo.toJsonObject());

        if (loggedInUser.type != UserType.STUDENT || loggedInUser.studentId != workService.getById(todo.workId).studentId) {
            JSONObject errors = new JSONObject().put("studentId", ErrorString.INVALID_ID);
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(new ErrorResponse(errors).toString());
        }

        return ResponseEntity.status(HttpStatus.OK).body(response.toString());
    }

    @PostMapping(path = "", consumes = { MediaType.APPLICATION_JSON_VALUE })
    public ResponseEntity<String> addTodo(@RequestHeader("Authorization") String authApiKey, 
        @RequestBody Todo todo) {
        AuthToken authToken = authTokenService.verifyBearerKey(authApiKey);
		if (!authToken.valid) {
			JSONObject errors = new JSONObject().put("accessToken", ErrorString.INVALID_ACCESS_TOKEN);
			return ResponseEntity.status(HttpStatus.FORBIDDEN).body(new ErrorResponse(errors).toString());
		}
		User loggedInUser = userService.getById(authToken.userId);

        if (!workService.existsById(todo.workId)) {
            JSONObject errors = new JSONObject().put("workId", ErrorString.INVALID_ID);
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ErrorResponse(errors).toString());
        }

        if (loggedInUser.type != UserType.STUDENT || loggedInUser.studentId != workService.getById(todo.workId).studentId) {
            JSONObject errors = new JSONObject().put("studentId", ErrorString.INVALID_ID);
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(new ErrorResponse(errors).toString());
        }

        // TODO: Refactor into something clean
        if (todo.workId == null || todo.date == null || todo.priority == null) {
            JSONObject errors = new JSONObject();
            if(todo.workId   == null) {errors.put("workId",   ErrorString.emptyString("workId"));}
            if(todo.date     == null) {errors.put("date",     ErrorString.emptyString("date"));}
            if(todo.priority == null) {errors.put("priority", ErrorString.emptyString("priority"));}
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ErrorResponse(errors).toString());
        }

        todoService.addTodo(todo);

        return ResponseEntity.status(HttpStatus.OK).body(new Response("success").toString());
    }

    @PatchMapping(path = "", consumes = { MediaType.APPLICATION_JSON_VALUE })
    public ResponseEntity<String> patchTodo(@RequestHeader("Authorization") String authApiKey, 
        @RequestBody Todo todo) {
        AuthToken authToken = authTokenService.verifyBearerKey(authApiKey);
        if (!authToken.valid) {
            JSONObject errors = new JSONObject().put("accessToken", ErrorString.INVALID_ACCESS_TOKEN);
            return ResponseEntity.status(HttpStatus.FORBIDDEN).body(new ErrorResponse(errors).toString());
        }
        User loggedInUser = userService.getById(authToken.userId);

        // TODO: separatly check for todo id and work id
        if (!todoService.existsById(todo.todoId)) {
            JSONObject errors = new JSONObject().put("todoId", ErrorString.INVALID_ID);
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ErrorResponse(errors).toString());
        }

        Todo todotoupdate = todoService.getById(todo.todoId);
        todo.workId = todotoupdate.workId;

        if (loggedInUser.type != UserType.STUDENT || loggedInUser.studentId != workService.getById(todo.workId).studentId) {
            JSONObject errors = new JSONObject().put("studentId", ErrorString.PERMISSION_ERROR);
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(new ErrorResponse(errors).toString());
        }

        if (todo.date == null) {
            todo.date = todotoupdate.date;
        }
        if (todo.plannedTime == null) {
            todo.plannedTime = todotoupdate.plannedTime;
        }
        if (todo.projectedStartTime == null) {
            todo.projectedStartTime = todotoupdate.projectedStartTime;
        }
        if (todo.priority == null) {
            todo.priority = todotoupdate.priority;
        }

        todoService.updateTodo(todo);

        return ResponseEntity.status(HttpStatus.OK).body(new Response("success").toString());
    }

    @DeleteMapping 
}
