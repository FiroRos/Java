package com.fizzbuzz;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)) {
            System.out.print("Choose a number: ");
            int number = scanner.nextInt();
            
            if (number % 5 == 0 && !(number % 3 ==  0))
                System.out.println("Fizz");
                
            else if (number % 3 == 0 && !(number % 5 == 0))
                System.out.println("Buzz");

            else if (number % 5 == 0 && number % 3 == 0)
                System.out.println("FizzBuzz");

            else
                System.out.println(number);
        }
    }
 }
