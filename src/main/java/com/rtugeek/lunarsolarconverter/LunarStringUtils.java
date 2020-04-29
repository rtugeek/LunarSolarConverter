package com.rtugeek.lunarsolarconverter;

/**
 * @author Jack Fu rtugeek@gmail.com
 * @date 2020/04/29
 */
public class LunarStringUtils {
    public final static String CHINESE_MONTH[] = {"一", "二", "三", "四", "五", "六", "七", "八", "九",
            "十", "冬", "腊"};
    public final static String CHINESE_NUMBER[] = {"〇", "一", "二", "三", "四", "五", "六", "七",
            "八", "九"};
    public final static String NUMBER = "0123456789";


    public static String getChinaDayString(int day) {
        if (day > 30) {
            return "";
        }
        if (day == 10) {
            return "初十";
        } else if (day == 20) {
            return "二十";
        } else if (day == 30) {
            return "三十";
        } else {
            String chineseTen[] = {"初", "十", "廿", "三"};
            int n = day % 10 == 0 ? 9 : day % 10;
            return chineseTen[day / 10] + CHINESE_NUMBER[n];
        }
    }
}
