package com.mortgage_calculator;
import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;
        // Boolean validPrincipal = false;
        // Boolean validInteresrRate = false;
        // Boolean validYears = false;
        Scanner scanner = new Scanner(System.in);
        int principal;
        float annualInterest;
        byte years;

        while (true) {
            System.out.print("Principal ($1k - $1M): ");
            principal = scanner.nextInt();
            if (principal >= 1_000  && principal <= 1_000_000) {
                break;
            } else {
                System.out.println("Please enter a value between 1,000 and 1,000,000");
            }   
        }
        while (true ) {
            System.out.print("Annual Interest Rate (0%-30%): ");
            annualInterest = scanner.nextFloat();
            if (annualInterest >= 0 && annualInterest <= 30) {
                break;
            } else {
                System.out.println("Please enter a value between 1 and 30");
            }
        }
        float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;

        while (true) {
            System.out.print("Period (Years 1-30): ");
            years = scanner.nextByte();
            if (years >= 1 && years <= 30) {
                break;
            } else {
                System.out.println("Please enter a value between 1 and 30");
            }
        }
        
        int numberOfPayments = years * MONTHS_IN_YEAR;

        Double mortgage = principal * ((monthlyInterest * (Math.pow((1 + monthlyInterest), numberOfPayments))) / (Math.pow((1 + monthlyInterest), numberOfPayments) - 1));
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortage: " + mortgageFormatted);
    }  
}
