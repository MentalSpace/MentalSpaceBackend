package dev.mentalspace.wafflecone.databaseobject;

import org.json.JSONObject;

public class Enrollment {
    public Long enrollmentId;
    public Long studentId;
    public Long periodId;
    public Integer studentPreference;

    public Enrollment() {
    }

    public JSONObject toJSON() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("enrollmentId",      this.enrollmentId);
        jsonObject.put("studentId",         this.studentId);
        jsonObject.put("periodId",          this.periodId);
        jsonObject.put("studentPreference", this.studentPreference);
        return jsonObject;
    }

    public JSONObject toJSON(JSONObject jsonObject) {
        jsonObject.put("enrollmentId",      this.enrollmentId);
        jsonObject.put("studentId",         this.studentId);
        jsonObject.put("periodId",          this.periodId);
        jsonObject.put("studentPreference", this.studentPreference);
        return jsonObject;
    }
}
