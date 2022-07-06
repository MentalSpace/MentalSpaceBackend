package dev.mentalspace.wafflecone.databaseobject;

public class School {
    public Long schoolId;
    public String shortName;
    public String name;
    public String address;

    public School() {
    }
}

/*Table "school" {
  "school_id" int [pk, increment]
  "short_name" TEXT [not null]
  "name" TEXT [not null]
  "address" TEXT [not null]
} */