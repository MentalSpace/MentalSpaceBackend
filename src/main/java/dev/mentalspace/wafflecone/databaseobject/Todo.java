package dev.mentalspace.wafflecone.databaseobject;

import org.json.JSONObject;

public class Todo {
    public Long todoId;
    public Long workId;
    public Long date;
    public Long plannedTime;
    public Long projectedStartTime;
    public Integer priority;

    public Todo() {
    }

    public JSONObject toJSON() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("todoId",                this.todoId);
        jsonObject.put("workId",                this.workId);
        jsonObject.put("date",                  this.date);
        jsonObject.put("plannedTime",           this.plannedTime);
        jsonObject.put("projectedStartTime",    this.projectedStartTime);
        jsonObject.put("priority",              this.priority);
        return jsonObject;
    }

    public JSONObject toJSON(JSONObject jsonObject) {
        jsonObject.put("todoId",                this.todoId);
        jsonObject.put("workId",                this.workId);
        jsonObject.put("date",                  this.date);
        jsonObject.put("plannedTime",           this.plannedTime);
        jsonObject.put("projectedStartTime",    this.projectedStartTime);
        jsonObject.put("priority",              this.priority);
        return jsonObject;
    }
}
