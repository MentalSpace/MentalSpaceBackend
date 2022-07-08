package dev.mentalspace.wafflecone.databaseobject;

import org.json.JSONObject;

public class Work {
    public Long workId;
    public Long studentId;
    public Long assignmentId;
    public Long remainingTime;
    public Integer priority;

    public Work() {
    }

    public JSONObject toJSON() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("workId",        this.workId);
        jsonObject.put("studentId",     this.studentId);
        jsonObject.put("assignmentId",  this.assignmentId);
        jsonObject.put("remainingTime", this.remainingTime);
        jsonObject.put("priority",      this.priority);
        return jsonObject;
    }

    public JSONObject toJSON(JSONObject jsonObject) {
        jsonObject.put("workId",        this.workId);
        jsonObject.put("studentId",     this.studentId);
        jsonObject.put("assignmentId",  this.assignmentId);
        jsonObject.put("remainingTime", this.remainingTime);
        jsonObject.put("priority",      this.priority);
        return jsonObject;
    }
}
