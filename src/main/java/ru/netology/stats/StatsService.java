package ru.netology.stats;

public class StatsService {
    public double sum(double[] sales) {
        double sum = 0;
        for (double sale : sales) {
            sum = sum + sale;
        }
        return sum;
    }

    public double average(double[] sales) {
        double average = sum(sales) / sales.length;
        return average;
    }

    public int monthOfHighSales(double[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (double sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month++;
        }
        return maxMonth + 1;
    }

    public int monthOfMinSales(double[] sales) {
        int minMonth = 0;
        int month = 0;
        for (double sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month++;
        }
        return minMonth + 1;
    }

    public int amountMonthUnderAverage(double[] sales) {
        int month = 0;
        for (double sale : sales) {
            if (sale < average(sales)) {
                month++;
            }
        }
        return month;
    }

    public int amountMonthUpperAverage(double[] sales) {
        int month = 0;
        for (double sale : sales) {
            if (sale > average(sales)) {
                month++;
            }
        }
        return month;
    }
}