package ru.netology.javaqa.relaxAndWork.monthsCalc;

public class Main {
    public static void main(String[] args) {
        MonthsCalc calculation = new MonthsCalc();
        int counterMonths = calculation.calculation(10000, 3000, 20000);
        System.out.println("Месяцев отдыха " + counterMonths);
    }
}
