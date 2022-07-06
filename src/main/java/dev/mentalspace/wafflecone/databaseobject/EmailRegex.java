package dev.mentalspace.wafflecone.databaseobject;

public class EmailRegex {
    public Long emailRegexId;
    public Long schoolId;
    public String matchDomain;
    public String regex;
    public Integer permissions;

    public EmailRegex() {
    }
}

/*Table "email_regex" {
  "email_regex_id" int [pk, increment]
  "school_id" INTEGER [not null]
  "match_domain" TEXT [not null]
  "regex" TEXT [not null]
  "permissions" INTEGER [not null, default: 0]
} */