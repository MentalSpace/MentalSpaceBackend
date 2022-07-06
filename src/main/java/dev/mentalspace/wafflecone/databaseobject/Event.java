package dev.mentalspace.wafflecone.databaseobject;

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
} */