package dev.mentalspace.wafflecone.databaseobject;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

public class EmailRegexRowMapper implements RowMapper<EmailRegex> {
    @Override
    public EmailRegex mapRow(ResultSet row, int rowNum) throws SQLException {
        EmailRegex emailRegex = new EmailRegex();
        emailRegex.emailRegexId = row.getLong   ("email_regex_id");
        emailRegex.schoolId     = row.getLong   ("school_id");
        emailRegex.matchDomain  = row.getString ("match_domain");
        emailRegex.regex        = row.getString ("regex");
        emailRegex.permissions  = row.getInt    ("permissions");
        return emailRegex;
    }
}

/*package dev.mentalspace.wafflecone.databaseobject;

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