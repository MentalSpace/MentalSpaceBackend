package dev.mentalspace.wafflecone.databaseobject;

public class Subject {
    public Long subjectId;
    public String department;
    public String description;
    public String name;

    public Subject() {
    }
}

/*Table "subject" {
  "subject_id" int [pk, increment]
  "department" TEXT [not null]
  "description" TEXT
  "name" TEXT [not null]
} */