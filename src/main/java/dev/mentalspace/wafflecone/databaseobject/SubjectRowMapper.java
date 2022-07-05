package dev.mentalspace.wafflecone.databaseobject;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

public class StudentRowMapper implements RowMapper<Student> {
    @Override
    public Student mapRow(ResultSet row, int rowNum) throws SQLException {
        Student student = new Student();
        student.subjectId = row.getLong("subject_id");
        student.department = row.getString("department");
        student.description = row.getString("description");
        student.name = row.getString("name");
        return student;
    }
}
