package com.rtugeek.lunarsolarconverter;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author Jack Fu rtugeek@gmail.com
 * @date 2020/04/29
 */
public class LunarSolarConverterTest extends TestCase {

    public void testLunarYearToGanZhi() {
    }

    public void testLunarToSolar() {
        //农历生日测试
        Lunar lunar = new Lunar(2020, 8, 17, false);
        Solar solar = LunarSolarConverter.LunarToSolar(lunar);// 2020-10-3

        Assert.assertEquals("2020-10-3", solar.toString());

        // 2020 闰四月测试
        Lunar leapLunar = new Lunar(2020, 4, 25, true);
        Solar leapSolar = LunarSolarConverter.LunarToSolar(leapLunar);// 2020-6-16

        Assert.assertEquals("2020-6-16", leapSolar.toString());

        Lunar randomLunar = new Lunar(2050, 6, 5, false);
        Solar randomSolar = LunarSolarConverter.LunarToSolar(randomLunar);// 2050-7-23

        Assert.assertEquals("2050-7-23", randomSolar.toString());
    }

    public void testSolarToLunar() {
        Solar solar = new Solar(2020, 10, 1);
        Lunar lunar = LunarSolarConverter.SolarToLunar(solar);

        Assert.assertEquals("2020年八月十五日", lunar.toString());

        Solar solar2 = new Solar(2020, 6, 16);
        Lunar lunar2 = LunarSolarConverter.SolarToLunar(solar2);

        Assert.assertEquals("2020年闰四月廿五日", lunar2.toString());

        Solar solar3 = new Solar(2050, 7, 23);
        Lunar lunar3 = LunarSolarConverter.SolarToLunar(solar3);

        Assert.assertEquals("2050年六月初五日", lunar3.toString());
    }
}