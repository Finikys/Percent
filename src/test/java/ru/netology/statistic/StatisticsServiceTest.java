package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StatisticsServiceTest {

    @Test
    void findMax() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }

    @Test
    void findMaxCount() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 25, 13, 40, 5, 3, 8, 6, 12, 151, 55};
        long expected = 151;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }


}