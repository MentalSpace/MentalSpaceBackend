package dev.mentalspace.wafflecone.databaseobject;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

public class AssignmentRowMapper implements RowMapper<Assignment> {
    @Override
    public Assignment mapRow(ResultSet row, int rowNum) throws SQLException {
        Assignment assignment = new Assignment();
        assignment.assignmentId    = row.getLong   ("assignment_id");
        assignment.periodId        = row.getLong   ("period_id");
        assignment.dateAssigned    = row.getLong   ("date_assigned");
        assignment.dateDue         = row.getLong   ("date_due");
        assignment.type            = row.getString ("type");
        assignment.estimatedBurden = row.getLong   ("estimated_burden");
        assignment.name            = row.getString ("name");
        assignment.description     = row.getString ("description");
        return assignment;
    }
}

/*package dev.mentalspace.wafflecone.databaseobject;

public class Assignment {
    public Long assignmentId;
    public Long periodId;
    public Long dateAssigned;
    public Long dateDue;
    public String type;
    public Long estimatedBurden;
    public String name;
    public String description;

    public Assignment() {
    }  
}

/*Table "assignment" {
  "assignment_id" int [pk, increment]
  "period_id" INTEGER [not null]
  "date_assigned" INTEGER [not null]
  "date_due" INTEGER [not null]
  "type" TEXT [not null]
  "estimated_burden" INTEGER
  "name" TEXT
  "description" TEXT
} */