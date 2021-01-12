package com.rtugeek.lunarsolarconverter;

/**
 * @author Jack Fu rtugeek@gmail.com
 * @date 2020/04/29
 */
public class Lunar {
    public boolean isLeap;
    public int dayOfMonth;
    /**
     * 1-12
     */
    public int monthOfYear;
    public int year;

    public Lunar() {

    }
    public Lunar(int year, int monthOfYear, int dayOfMonth, boolean isLeap) {
        this.isLeap = isLeap;
        this.dayOfMonth = dayOfMonth;
        this.monthOfYear = monthOfYear;
        this.year = year;
    }

    public boolean isLeap() {
        return isLeap;
    }

    public void setLeap(boolean leap) {
        this.isLeap = leap;
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
        StringBuilder stringBuilder = new StringBuilder(year + "年");
        if (isLeap) {
            stringBuilder.append("闰");
        }
        stringBuilder.append(LunarStringUtils.CHINESE_MONTH[monthOfYear - 1]).append("月")
                .append(LunarStringUtils.getChinaDayString(dayOfMonth));
        return stringBuilder.toString();
    }
}
