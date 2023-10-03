package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions;

public class StatisticsServiceTest {

    @Test
    void shouldReturnFirstNumberOfArray() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldReturnNotFirstNumberOfArray() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {7, 5, 8, 4, 5, 3, 8, 6, 12, 11, 11};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        Assertions.assertEquals(expected, actual);
    }
}