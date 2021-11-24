package com.project.assignmenttwo;

public class MyDate {
    private int day;
    private int month;
    private int year;

    //Debug Constructor
    public MyDate() {
        this.day = 0;
        this.month = 1;
        this.year = 2;
    }

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public String getMonthShortForm() {
        return String.valueOf(month);
    }

    public String getMonthLongForm() {
        return String.valueOf(month);   //Change to long form
    }

    public int getYear() {
        return year;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }


    @Override
    public String toString() {
        return "MyDate{" +
                "day=" + day +
                ", month=" + month +
                ", year=" + year +
                '}';
    }
}
