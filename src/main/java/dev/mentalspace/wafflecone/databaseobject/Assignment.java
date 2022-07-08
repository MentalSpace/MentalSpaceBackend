package dev.mentalspace.wafflecone.databaseobject;

import org.json.JSONObject;

public class Assignment {
    public Long assignmentId;
    public Long periodId;
    public Long dateAssigned;
    public Long dateDue;
    public String type;
    public Long estimatedBurden;
    public String name;
    public String description;

    public Assignment() {
    }

    public JSONObject toJSON() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("assignmentId",       this.assignmentId);
        jsonObject.put("periodId",           this.periodId);
        jsonObject.put("dateAssigned",       this.dateAssigned);
        jsonObject.put("dateDue",            this.dateDue);
        jsonObject.put("type",               this.type);
        jsonObject.put("estimatedBurden",    this.estimatedBurden);
        jsonObject.put("name",               this.name);
        jsonObject.put("description",        this.description);
        return jsonObject;
    }

    public JSONObject toJSON(JSONObject jsonObject) {
        jsonObject.put("assignmentId",       this.assignmentId);
        jsonObject.put("periodId",           this.periodId);
        jsonObject.put("dateAssigned",       this.dateAssigned);
        jsonObject.put("dateDue",            this.dateDue);
        jsonObject.put("type",               this.type);
        jsonObject.put("estimatedBurden",    this.estimatedBurden);
        jsonObject.put("name",               this.name);
        jsonObject.put("description",        this.description);
        return jsonObject;
    }
}
