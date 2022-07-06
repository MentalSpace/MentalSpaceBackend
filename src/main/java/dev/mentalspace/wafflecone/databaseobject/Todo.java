package dev.mentalspace.wafflecone.databaseobject;

public class Todo {
    public Long todoId;
    public Long workId;
    public Long date;
    public Long plannedTime;
    public Long projectedStartTime;
    public Integer priority;

    public Todo() {
    }
}

/*Table "todo" {
  "todo_id" int [pk, increment]
  "work_id" INTEGER [not null]
  "date" INTEGER [not null]
  "planned_time" BIGINT
  "projected_start_time" BIGINT
  "priority" INTEGER [not null]
} */