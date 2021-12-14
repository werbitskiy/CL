package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatisticServiceTest {

    @Test
    void findMax() {
        StatisticService service = new StatisticService();

        long[] incomesInBillions = {5, 8, 4, 5, 3, 8, 6, 11, 11, 12,};

        long actual = service.findMax(incomesInBillions);
        long expected = 12;


        assertEquals(expected, actual);
    }
}