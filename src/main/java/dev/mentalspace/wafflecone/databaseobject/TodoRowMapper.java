package dev.mentalspace.wafflecone.databaseobject;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

public class TodoRowMapper implements RowMapper<Todo> {
    @Override
    public Todo mapRow(ResultSet row, int rowNum) throws SQLException {
        Todo todo = new Todo();
        todo.todoId              = row.getLong ("todo_id");
        todo.workId              = row.getLong ("work_id");
        todo.date                = row.getLong ("date");
        todo.plannedTime         = row.getLong ("planned_time");
        todo.projectedStartTime  = row.getLong ("projected_start_time");
        todo.priority            = row.getInt  ("priority");
        return todo;
    }
}

/*package dev.mentalspace.wafflecone.databaseobject;

public class Todo {
    public Long todoId;
    public Long workId;
    public Long date;
    public Long plannedTime;
    public Long projectedStartTime;
    public Integer priority;

    public Todo() {
    }
}

/*Table "todo" {
  "todo_id" int [pk, increment]
  "work_id" INTEGER [not null]
  "date" INTEGER [not null]
  "planned_time" BIGINT
  "projected_start_time" BIGINT
  "priority" INTEGER [not null]
} */