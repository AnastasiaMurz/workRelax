package ru.netology.javaqa.relaxAndWork.monthsCalc;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class MonthsCalcTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/months.csv")
    void numberMonths(int income, int expenses, int threshold, int expected) {
        MonthsCalc calc = new MonthsCalc();
        int actual = calc.calculation(income, expenses, threshold);
        Assertions.assertEquals(expected,actual);
    }
}
