package dev.mentalspace.wafflecone.databaseobject;

public class Student {
    public Long studentId;
    public String canonicalId;
    public String firstName;
    public String lastName;
    public Long phone;
    public Integer grade;

    public Student() {
    }    
}

/*Table "student" {
  "student_id" int [pk, increment]
  "canonical_id" TEXT [unique]
  "first_name" TEXT [not null]
  "last_name" TEXT [not null]
  "phone" BIGINT
  "grade" INTEGER [not null]
} */