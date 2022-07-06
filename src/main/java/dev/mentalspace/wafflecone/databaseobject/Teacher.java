package dev.mentalspace.wafflecone.databaseobject;

public class Teacher {
    public Long teacherId;
    public String canonicalId;
    public String firstName;
    public String lastName;
    public Long phone;
    public String department;

    public Teacher() {
    }
}

/*Table "teacher" {
  "teacher_id" int [pk, increment]
  "canonical_id" TEXT [unique]
  "first_name" TEXT [not null]
  "last_name" TEXT [not null]
  "phone" BIGINT
  "department" TEXT [not null]
} */