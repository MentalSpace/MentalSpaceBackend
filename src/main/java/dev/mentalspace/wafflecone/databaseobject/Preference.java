package dev.mentalspace.wafflecone.databaseobject;

public class Preference {
    public Long preferenceId;
    public Long studentId;
    public Integer assignmentOrder;
    public Integer startType;
    public Long breakLength;
    public Long breakFrequency;

    public Preference() {
    }
}

/*Table "preference" {
  "preference_id" int [pk, increment]
  "student_id" INTEGER [not null]
  "assignment_order" INTEGER [not null]
  "start_type" INTEGER [not null]
  "break_length" INTEGER
  "break_frequency" INTEGER
} */