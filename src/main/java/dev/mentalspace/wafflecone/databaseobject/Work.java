package dev.mentalspace.wafflecone.databaseobject;

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