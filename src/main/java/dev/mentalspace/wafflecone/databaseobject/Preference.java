package dev.mentalspace.wafflecone.databaseobject;

import org.json.JSONObject;

public class Preference {
    public Long preferenceId;
    public Long studentId;
    public Integer assignmentOrder;
    public Integer startType;
    public Long breakLength;
    public Long breakFrequency;

    public Preference() {
    }

    public JSONObject toJSON() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("preferenceId",      this.preferenceId);
        jsonObject.put("studentId",         this.studentId);
        jsonObject.put("assignmentOrder",   this.assignmentOrder);
        jsonObject.put("startType",         this.startType);
        jsonObject.put("breakLength",       this.breakLength);
        jsonObject.put("breakFrequency",    this.breakFrequency);
        return jsonObject;
    }

    public JSONObject toJSON(JSONObject jsonObject) {
        jsonObject.put("preferenceId",      this.preferenceId);
        jsonObject.put("studentId",         this.studentId);
        jsonObject.put("assignmentOrder",   this.assignmentOrder);
        jsonObject.put("startType",         this.startType);
        jsonObject.put("breakLength",       this.breakLength);
        jsonObject.put("breakFrequency",    this.breakFrequency);
        return jsonObject;
    }
}
