package ru.netology.services;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
//import ru.netology.services.monthsOfVocationService;

public class monthsOfVocationServiceTest {

    @ParameterizedTest
//    @CsvSource({
//            "3, 10_000, 3_000, 20_000",
//            "2, 100_000, 60_000, 150_000"
//    })
    @CsvFileSource(files="src/test/resources/monthsOfVocation.csv")
    public void shouldCalculateForRegisteredAndUnderLimit(int expected, int income, int expenses, int threshold) {
        monthsOfVocationService service = new monthsOfVocationService();

        // подготавливаем данные:
//        int income = 10_000;
//        int xepenses = 3_000;
//        int threshold = 20_000;
//        int expected = 3;

        // вызываем целевой метод:
        int actual = service.calculate(income, expenses, threshold);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }

//    @Test
//    void shouldCalculateForRegisteredAndOverLimit() {
//        monthsOfVocationService service = new monthsOfVocationService();
//
//        // подготавливаем данные:
//        int income = 100_000;
//        int xepenses = 60_000;
//        int threshold = 150_000;
//        int expected = 2;
//
//        // вызываем целевой метод:
//        long actual = service.calculate(income, xepenses, threshold);
//
//        // производим проверку (сравниваем ожидаемый и фактический):
//        Assertions.assertEquals(expected, actual);
//    }

}
