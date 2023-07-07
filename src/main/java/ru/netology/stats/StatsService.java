package ru.netology.stats;

public class StatsService {
    public int minSales(int[] sales) {
        int minMonth = 0; //номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int calculateSumSales(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;

    }

    public int findAverage(int[] sales) {
        return calculateSumSales(sales) / sales.length;

    }

    public int findMaxSales(int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }
    public int LowFindAverage(int[] sales) {
        int findAverage =15;
        int calculateSumSales = 25;
        if (findAverage <= calculateSumSales) ;

        return calculateSumSales(sales) / sales.length;
    }
    public int HightFindAverage(int[] sales) {
        int findAverage = 15;
        int calculateSumSales = 25;
        if (findAverage >= calculateSumSales) ;

        return calculateSumSales(sales) / sales.length;
    }

}





