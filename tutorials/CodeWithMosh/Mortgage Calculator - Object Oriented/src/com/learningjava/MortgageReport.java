package com.learningjava;

import java.text.NumberFormat;

public class MortgageReport {

    private final NumberFormat currency;
    private MortgageCalculator calculator;

    public MortgageReport(MortgageCalculator calculator) {
        this.calculator = calculator;
        currency = NumberFormat.getCurrencyInstance();
    }

    public void printPaymentSchedule(){
        // calculate and print loan balance
        System.out.println();
        System.out.println("-----------------------------------------------");
        System.out.println("PAYMENT SCHEDULE");
        System.out.println("-----------------------------------------------");

        for( double balance : calculator.getRemainingBalances())
            System.out.println(currency.format(balance));
    }

    public void printMortgage(){
        double mortgage = calculator.calculateMortgage();
        System.out.println();
        System.out.println("-----------------------------------------------");
        System.out.println("MORTGAGE");
        System.out.println("-----------------------------------------------");
        System.out.println("Monthly Payments: " + currency.format(mortgage) + "\n");
    }
}
