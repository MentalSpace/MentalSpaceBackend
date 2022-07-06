package dev.mentalspace.wafflecone.databaseobject;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

public class WorkRowMapper implements RowMapper<Work> {
    @Override
    public Work mapRow(ResultSet row, int rowNum) throws SQLException {
        Work work = new Work();
        work.workId         = row.getLong ("work_id");
        work.studentId      = row.getLong ("student_id");
        work.assignmentId   = row.getLong ("assignment_id");
        work.remainingTime  = row.getLong ("remaining_time");
        work.priority       = row.getInt  ("priority");
        return work;
    }
}

/*package dev.mentalspace.wafflecone.databaseobject;

public class Work {
    public Long workId;
    public Long studentId;
    public Long assignmentId;
    public Long remainingTime;
    public Integer priority;

    public Work() {
    }
}

/*Table "work" {
  "work_id" int [pk, increment]
  "student_id" INTEGER [not null]
  "assignment_id" INTEGER [not null]
  "remaining_time" BIGINT [not null]
  "priority" INTEGER [not null]
} */