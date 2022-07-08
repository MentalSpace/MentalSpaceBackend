package dev.mentalspace.wafflecone.databaseobject;

import org.json.JSONObject;

public class School {
    public Long schoolId;
    public String shortName;
    public String name;
    public String address;

    public School() {
    }

    public JSONObject toJSON() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("schoolId",  this.schoolId);
        jsonObject.put("shortName", this.shortName);
        jsonObject.put("name",      this.name);
        jsonObject.put("address",   this.address);
        return jsonObject;
    }

    public JSONObject toJSON(JSONObject jsonObject) {
        jsonObject.put("schoolId",  this.schoolId);
        jsonObject.put("shortName", this.shortName);
        jsonObject.put("name",      this.name);
        jsonObject.put("address",   this.address);
        return jsonObject;
    }
}
