package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test
    public void SumOfMinSales() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedDay = 9;
        int actualDay = service.minSales(sales);

        Assertions.assertEquals(expectedDay, actualDay);

    }

    @Test
    public void CalculateSumSales() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedDay = 25;
        int actualDay = service.calculateSumSales(sales);

        Assertions.assertEquals(25, 25);
    }

    @Test
    public void findAverage() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedDay = 15;
        int actualDay = 15;

        Assertions.assertEquals(15, 15);

    }

    @Test
    public void findMaxSales() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedDay = 20;
        int actualDay = 20;

        Assertions.assertEquals(20, 20);
    }
    @Test
    public  void lowFindAverage() {
        int[] sales ={8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18} ;
        int expectedDay = 5;
        int actualDay = 5;

        Assertions.assertEquals(5,5);
    }
    @Test
    public void HightFindAverage() {
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedDay = 7;
        int actualDay = 7;

        Assertions.assertEquals(7, 7);
    }
}

