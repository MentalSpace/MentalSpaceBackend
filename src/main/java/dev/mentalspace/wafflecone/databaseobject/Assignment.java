package dev.mentalspace.wafflecone.databaseobject;

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