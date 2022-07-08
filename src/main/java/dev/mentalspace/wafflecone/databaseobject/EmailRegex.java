package dev.mentalspace.wafflecone.databaseobject;

import org.json.JSONObject;

public class EmailRegex {
    public Long emailRegexId;
    public Long schoolId;
    public String matchDomain;
    public String regex;
    public Integer permissions;

    public EmailRegex() {
    }

    public JSONObject toJSON() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("emailRegexId",  this.emailRegexId);
        jsonObject.put("schoolId",      this.schoolId);
        jsonObject.put("matchDomain",   this.matchDomain);
        jsonObject.put("regex",         this.regex);
        jsonObject.put("permissions",   this.permissions);
        return jsonObject;
    }

    public JSONObject toJSON(JSONObject jsonObject) {
        jsonObject.put("emailRegexId",  this.emailRegexId);
        jsonObject.put("schoolId",      this.schoolId);
        jsonObject.put("matchDomain",   this.matchDomain);
        jsonObject.put("regex",         this.regex);
        jsonObject.put("permissions",   this.permissions);
        return jsonObject;
    }
}
