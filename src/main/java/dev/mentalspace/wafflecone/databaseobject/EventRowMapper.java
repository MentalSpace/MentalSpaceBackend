package dev.mentalspace.wafflecone.databaseobject;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

public class EventRowMapper implements RowMapper<Event> {
    @Override
    public Event mapRow(ResultSet row, int rowNum) throws SQLException {
        Event event = new Event();
        event.eventId      = row.getLong   ("event_id");
        event.studentId    = row.getLong   ("student_id");
        event.name         = row.getString ("name");
        event.description  = row.getString ("description");
        event.startTime    = row.getLong   ("start_time");
        event.endTime      = row.getLong   ("end_time");
        event.startDate    = row.getLong   ("start_date");
        event.endDate      = row.getLong   ("end_date");
        event.recurring    = row.getInt    ("recurring");
        event.weeklyDays   = row.getInt    ("weekly_days");
        event.monthlyDays  = row.getInt    ("monthly_days");
        return event;
    }
}

/*package dev.mentalspace.wafflecone.databaseobject;

public class Event {
    public Long eventId;
    public Long studentId;
    public String name;
    public String description;
    public Long startTime;
    public Long endTime;
    public Long startDate;
    public Long endDate;
    public Integer recurring;
    public Integer weeklyDays;
    public Integer monthlyDays;

    public Event() {
    }
}

/*Table "event" {
  "event_id" int [pk, increment]
  "student_id" INTEGER [not null]
  "name" TEXT [not null]
  "description" TEXT
  "start_time" BIGINT [not null]
  "end_time" BIGINT [not null]
  "start_date" INTEGER [not null]
  "end_date" INTEGER
  "recurring" INTEGER [not null]
  "weekly_days" INTEGER
  "monthly_days" INTEGER
}*/