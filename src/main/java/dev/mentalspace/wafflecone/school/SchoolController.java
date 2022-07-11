package dev.mentalspace.wafflecone.school;

import dev.mentalspace.wafflecone.Utils;
import dev.mentalspace.wafflecone.WaffleConeController;
import dev.mentalspace.wafflecone.auth.AuthToken;
import dev.mentalspace.wafflecone.auth.AuthScope;
import dev.mentalspace.wafflecone.auth.AuthTokenService;

import java.util.List;

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
import dev.mentalspace.wafflecone.school.*;

@RestController
@RequestMapping(path = { "/api/v0/school" })
public class SchoolController {
    @Autowired
    SchoolService schoolService;
    @Autowired
    AuthTokenService authTokenService;
    @Autowired
    UserService userService;

    @GetMapping(path = "", consumes = { MediaType.APPLICATION_JSON_VALUE })
    public ResponseEntity<String> getSchool(
            @RequestParam(value = "shcoolId", defaultValue = "-1") Long searchSchoolId) {

        if (!schoolService.existsById(searchSchoolId)) {
            JSONObject errors = new JSONObject().put("schoolId", ErrorString.INVALID_ID);
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ErrorResponse(errors).toString());
        }

        School school = schoolService.getById(searchSchoolId);
        Response response = new Response("success").put("school", school.toJsonObject());
        return ResponseEntity.status(HttpStatus.OK).body(response.toString());
    }

    @GetMapping(path = "/all", consumes = { MediaType.APPLICATION_JSON_VALUE })
    public ResponseEntity<String> getAllSchool() {
        List<School> schools = schoolService.allSchool();
        Response response = new Response("success").put("school", schools);
        return ResponseEntity.status(HttpStatus.OK).body(response.toString());
    }
}
