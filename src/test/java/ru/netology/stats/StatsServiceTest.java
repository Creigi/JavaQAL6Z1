package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
//import org.junit.jupiter.params.provider.CsvSource;


public class StatsServiceTest {

    @Test
    public void testSum() {
        StatsService service = new StatsService();
        double[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        double sumExpected = 180;
        double sumActual = service.sum(sales);
        Assertions.assertEquals(sumExpected, sumActual);
    }

    @Test
    public void testAverage() {
        double[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        double averageExpected = 15;
        StatsService service = new StatsService();
        double averageActual = service.average(sales);
        Assertions.assertEquals(averageExpected, averageActual);
    }
    @Test
    public void testMaxMoth() {
        double[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int monthMaxSalesExpected = 8;
        StatsService service = new StatsService();
        int maxMonthActual = service.monthOfHighSales(sales);
        Assertions.assertEquals(monthMaxSalesExpected, maxMonthActual);
    }
    @Test
    public void testMinMonth() {
        double[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int monthMinSalesExpected = 9;
        StatsService service = new StatsService();
        int minMonthActual = service.monthOfMinSales(sales);
        Assertions.assertEquals(monthMinSalesExpected, minMonthActual);
    }
    @Test
    public void testCountMonthUnderLimit() {
        double[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int countMonthExpected = 5;
        StatsService service = new StatsService();
        int countMonthActual = service.amountMonthUnderAverage(sales);
        Assertions.assertEquals(countMonthExpected, countMonthActual);
    }
    @Test
    public void testCountMonthUpperLimit() {
        double[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int countMonthExpected = 5;
        StatsService service = new StatsService();
        int countMonthActual = service.amountMonthUpperAverage(sales);
        Assertions.assertEquals(countMonthExpected, countMonthActual);
    }
}