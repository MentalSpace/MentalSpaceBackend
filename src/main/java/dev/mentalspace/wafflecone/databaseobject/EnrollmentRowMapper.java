package dev.mentalspace.wafflecone.databaseobject;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

public class EnrollmentRowMapper implements RowMapper<Enrollment> {
    @Override
    public Enrollment mapRow(ResultSet row, int rowNum) throws SQLException {
        Enrollment enrollment = new Enrollment();
        enrollment.enrollmentId       = row.getLong ("enrollment_id");
        enrollment.studentId          = row.getLong ("student_id");
        enrollment.periodId           = row.getLong ("period_id");
        enrollment.studentPreference  = row.getInt  ("student_preference");
        return enrollment;
    }
}

/*package dev.mentalspace.wafflecone.databaseobject;

public class Enrollment {
    public Long enrollmentId;
    public Long studentId;
    public Long periodId;
    public Integer studentPreference;

    public Enrollment() {
    }   
}

/*Table "enrollment" {
  "enrollment_id" int [pk, increment]
  "student_id" INTEGER [not null]
  "period_id" INTEGER [not null]
  "student_preference" INTEGER
} */