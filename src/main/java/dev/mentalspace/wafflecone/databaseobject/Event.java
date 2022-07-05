package dev.mentalspace.wafflecone.databaseobject;

public class Event {
    public Long eventId;
    public Long studentId;
    public String name;
    public String description;
    public Long startTime;
    public Long endTime;
    public Integer recurring;
    public Integer weeklyDays;
    public Integer monthlyDays;

    public Event() {
    }
}
