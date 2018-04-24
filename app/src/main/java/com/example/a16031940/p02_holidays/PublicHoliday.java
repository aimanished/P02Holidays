package com.example.a16031940.p02_holidays;

public class PublicHoliday {

    private String holiday;
    private String date;

    public PublicHoliday(String holiday, String date) {
        this.holiday = holiday;
        this.date = date;
    }

    public String getHoliday() {
        return holiday;
    }

    public void setHoliday(String holiday) {
        this.holiday = holiday;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}

