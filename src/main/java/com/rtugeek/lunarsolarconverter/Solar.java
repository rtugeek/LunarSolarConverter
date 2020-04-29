package com.rtugeek.lunarsolarconverter;

/**
 * @author Jack Fu rtugeek@gmail.com
 * @date 2020/04/29
 */
public class Solar {
    public int dayOfMonth;
    /**
     * 1-12
     */
    public int monthOfYear;
    public int year;

    public Solar() {

    }

    public Solar(int year, int monthOfYear, int dayOfMonth) {
        this.dayOfMonth = dayOfMonth;
        this.monthOfYear = monthOfYear;
        this.year = year;
    }

    public int getDayOfMonth() {
        return dayOfMonth;
    }

    public void setDayOfMonth(int dayOfMonth) {
        this.dayOfMonth = dayOfMonth;
    }

    public int getMonthOfYear() {
        return monthOfYear;
    }

    public void setMonthOfYear(int monthOfYear) {
        this.monthOfYear = monthOfYear;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return year + "-" + monthOfYear + "-" + dayOfMonth;
    }
}
