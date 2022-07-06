package dev.mentalspace.wafflecone.databaseobject;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

public class PeriodRowMapper implements RowMapper<Period> {
    @Override
    public Period mapRow(ResultSet row, int rowNum) throws SQLException {
        Period period = new Period();
        period.periodId   = row.getLong    ("period_id");
        period.teacherId  = row.getLong    ("teacher_id");
        period.subjectId  = row.getLong    ("subject_id");
        period.period     = row.getInt     ("period");
        period.classCode  = row.getString  ("class_code");
        period.archived   = row.getBoolean ("archived");
        return period;
    }
}

/*package dev.mentalspace.wafflecone.databaseobject;

public class Period {
    public Long periodId;
    public Long teacherId;
    public Long subjectId;
    public Integer period;
    public String classCode;
    public boolean archived;

    public Period() {
    }
}

/*Table "period" {
  "period_id" int [pk, increment]
  "teacher_id" INTEGER [not null]
  "subject_id" INTEGER [not null]
  "period" INTEGER [not null]
  "class_code" TEXT [not null]
  "archived" BOOLEAN [not null, default: false]
} */