package dev.mentalspace.wafflecone.databaseobject;

public class Period {
    public Long periodId;
    public Long teacherId;
    public Long subjectId;
    public Integer period;
    public String classCode;
    public boolean archived;

    public Period() {
    }
}

/*Table "period" {
  "period_id" int [pk, increment]
  "teacher_id" INTEGER [not null]
  "subject_id" INTEGER [not null]
  "period" INTEGER [not null]
  "class_code" TEXT [not null]
  "archived" BOOLEAN [not null, default: false]
} */