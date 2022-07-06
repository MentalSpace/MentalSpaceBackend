package dev.mentalspace.wafflecone.databaseobject;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

public class StudentRowMapper implements RowMapper<Student> {
    @Override
    public Student mapRow(ResultSet row, int rowNum) throws SQLException {
        Student student = new Student();
        student.studentId    = row.getLong   ("student_id");
        student.canonicalId  = row.getString ("canonical_id");
        student.firstName    = row.getString ("first_name");
        student.lastName     = row.getString ("last_name");
        student.phone        = row.getLong   ("phone");
        student.grade        = row.getInt    ("grade");
        return student;
    }
}

/*package dev.mentalspace.wafflecone.databaseobject;

public class Student {
    public Long studentId;
    public String canonicalId;
    public String firstName;
    public String lastName;
    public Long phone;
    public Integer grade;

    public Student() {
    }    
}

/*Table "student" {
  "student_id" int [pk, increment]
  "canonical_id" TEXT [unique]
  "first_name" TEXT [not null]
  "last_name" TEXT [not null]
  "phone" BIGINT
  "grade" INTEGER [not null]
} */