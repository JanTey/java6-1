package ru.netology.services;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
//import ru.netology.services.monthsOfVocationService;

public class monthsOfVocationServiceTest {

    @Test
    void shouldCalculateForRegisteredAndUnderLimit() {
        monthsOfVocationService service = new monthsOfVocationService();

        // подготавливаем данные:
        int income = 10_000;
        int xepenses = 3_000;
        int threshold = 20_000;
        int expected = 3;

        // вызываем целевой метод:
        long actual = service.calculate(income, xepenses, threshold);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateForRegisteredAndOverLimit() {
        monthsOfVocationService service = new monthsOfVocationService();

        // подготавливаем данные:
        int income = 100_000;
        int xepenses = 60_000;
        int threshold = 150_000;
        int expected = 2;

        // вызываем целевой метод:
        long actual = service.calculate(income, xepenses, threshold);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }

}
