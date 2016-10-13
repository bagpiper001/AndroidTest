package com.example.rberkel.listviewproject;

/**
 * Created by rberkel on 13-10-2016.
 */

public class TimeRecord {
    private String time;
    private String notes;

    public TimeRecord(String time, String notes) {
        this.time = time;
        this.notes = notes;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String  getTime() {
        return time;
    }

    public String getNotes() {
        return notes;
    }
}
