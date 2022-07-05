package dev.mentalspace.wafflecone.databaseobject;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

public class StudentRowMapper implements RowMapper<Student> {
    @Override
    public Student mapRow(ResultSet row, int rowNum) throws SQLException {
        Student student = new Teacher();
        student.studentId    = row.getLong("student_id");
        student.canonicalId  = row.getString("canonical_id");
        student.firstName    = row.getString("first_name");
        student.lastName     = row.getString("last_name");
        student.phone        = row.getInt("phone");
        student.grade        = row.getInt("grade");
        return student;
    }
}