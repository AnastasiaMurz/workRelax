package ru.netology.javaqa.relaxAndWork.monthsCalc;

public class MonthsCalc {
    public int calculation (int income, int expenses, int threshold) {
        int counterMonths = 0;
        int initialAmount = 0;
        for (int a = 1; a < 12; a++) {
            if (initialAmount < threshold) {
                initialAmount = initialAmount + income - expenses;
            } else {
                counterMonths = counterMonths + 1;
                initialAmount = (initialAmount - expenses) / 3;
            }
        }
        return counterMonths;
    }
}
