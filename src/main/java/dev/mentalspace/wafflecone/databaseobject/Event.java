package dev.mentalspace.wafflecone.databaseobject;

public class Event {
    public Long eventId;
    public Long studentId;
    public String name;
    public String description;
    public String rrule;
    public Long duration;
    public RecurrenceRule recuringTime;

    public Event() {
    }

    public void setRecuringTime() {this.recuringTime = new RecurrenceRule(this.rrule);}

    public long getStartTimeForTheDay(long day) {return (this.recuringTime.);}
}
