package dev.mentalspace.wafflecone.databaseobject;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

public class TeacherRowMapper implements RowMapper<Teacher> {
    @Override
    public Teacher mapRow(ResultSet row, int rowNum) throws SQLException {
        Teacher teacher = new Teacher();
        teacher.teacherId    = row.getLong   ("teacher_id");
        teacher.canonicalId  = row.getString ("canonical_id");
        teacher.firstName    = row.getString ("first_name");
        teacher.lastName     = row.getString ("last_name");
        teacher.phone        = row.getLong   ("phone");
        teacher.department   = row.getString ("department");
        return teacher;
    }
}

/*package dev.mentalspace.wafflecone.databaseobject;

public class Teacher {
    public Long teacherId;
    public String canonicalId;
    public String firstName;
    public String lastName;
    public Long phone;
    public String department;

    public Teacher() {
    }
}

/*Table "teacher" {
  "teacher_id" int [pk, increment]
  "canonical_id" TEXT [unique]
  "first_name" TEXT [not null]
  "last_name" TEXT [not null]
  "phone" BIGINT
  "department" TEXT [not null]
} */