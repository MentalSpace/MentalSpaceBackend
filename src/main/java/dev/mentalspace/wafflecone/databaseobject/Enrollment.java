package dev.mentalspace.wafflecone.databaseobject;

public class Enrollment {
    public Long enrollmentId;
    public Long studentId;
    public Long periodId;
    public Integer studentPreference;

    public Enrollment() {
    }   
}

/*Table "enrollment" {
  "enrollment_id" int [pk, increment]
  "student_id" INTEGER [not null]
  "period_id" INTEGER [not null]
  "student_preference" INTEGER
} */