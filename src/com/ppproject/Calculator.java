package com.ppproject;
import java.util.Scanner;

public class Calculator {
    int a, b;
    Scanner input = new Scanner(System.in);

    int addition() {
        System.out.println("Enter 2 numbers for addition :");
        a = input.nextInt();
        b = input.nextInt();
        return (a + b);
    }

    int subtraction() {
        System.out.println("Enter 2 numbers for subtraction :");
        a = input.nextInt();
        b = input.nextInt();
        return (a - b);
    }

    int multiplication() {
        System.out.println("Enter 2 numbers for multiplication :");
        a = input.nextInt();
        b = input.nextInt();
        return (a * b);
    }

    int division() {
        System.out.println("Enter 2 numbers for division :");
        a = input.nextInt();
        b = input.nextInt();
        return (a / b);
    }

    void basicCalculator()
    {
        System.out.println("Basic Arithmetic calculator has been choosen");
        System.out.println("1 for addition");
        System.out.println("2 for substraction");
        System.out.println("3 for mutiplication");
        System.out.println("4 for division");
        System.out.println("Enter the task you wanna perform : ");
        int choice = input.nextInt();
        int ans = 0;

        switch (choice) {
            case 1:
                ans = addition();
                break;
            case 2:
                ans = subtraction();
                break;
            case 3:
                ans = multiplication();
                break;
            case 4:
                ans = division();
                break;
            default:
                System.out.println("Please enter the correct value ");
        }
        System.out.println("Answer = " + ans);
    }

    int power() {
        System.out.println("Enter 2 no. for power : ");
        a = input.nextInt();
        b = input.nextInt();
        return((int)Math.pow(a,b));  //typecast , it will convert int to double
    }

    int sqaureRoot() {
        System.out.println("Enter the no. for square root :");
        a = input.nextInt();
        return((int)Math.sqrt(a));
    }

    int maximum() {
        System.out.println("Enter 2 no. for maximum : ");
        a = input.nextInt();
        b = input.nextInt();
        return(Math.max(a,b));
    }

   int minimum() {
        System.out.println("Enter 2 no. for minimum : ");
        a = input.nextInt();
        b = input.nextInt();
        return(Math.min(a,b));
    }

    int absoluteValue() {
        System.out.println("Enter the no. to find the absolute value : ");
        double a = input.nextDouble(); //input as double
        double absValue = Math.abs(a); //now we have calculated the absolute value as double
        return((int) absValue); //here we have converted the result to int
    }


    void advanceCalulator() {
        System.out.println("Advance calulator has been choosen");
        System.out.println("1 for Power");
        System.out.println("2 for Square root");
        System.out.println("3 for maximum no.");
        System.out.println("4 for minimum no.");
        System.out.println("5 for absolute value");
        System.out.println("Enter the choice : ");
        int choice = input.nextInt();
        int ans = 0;
        switch (choice) {
            case 1:
                ans = power();
            case 2:
                ans = sqaureRoot();
            case 3:
                ans = maximum();
            case 4:
                ans = minimum();
            case 5:
                ans = absoluteValue();
            default:
                System.out.println("plz enter the correct value");
        }

        System.out.println("Answer = " + ans);
    }

     int percentage()
    {
        System.out.println("Enter total value : ");
        a = input.nextInt();
        System.out.println("Enter the portion value : ");
        b = input.nextInt();
        return(int)(((double)b/a)*100) ;
    }

    int percentOfANumber() {
        System.out.println("Enter the total value : ");
        a = input.nextInt();
        System.out.println("Enter the percentage : ");
        b = input.nextInt();
        double result = ((b/100.0)*a);
        return (int)result;
    }

    void percentageCalulator()
    {
            System.out.println("Percentage calculator has been choosen");
            System.out.println("1 for total percentage ");
            System.out.println("2 for percent of given no.");
            System.out.println("Enter the choice : ");
            int choice = input.nextInt();
            int ans = 0;
            switch(choice) {
                case 1:
                    ans = percentage();
                    break;
                case 2:
                    ans = percentOfANumber();
                    break;
                default:
                    System.out.println("Please enter the correct value");
            }
            System.out.println("Answer = " +ans);
        }



        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator c = new Calculator();
        System.out.println("1 for basic calculation");
        System.out.println("2 for advance calculation");
        System.out.println("3 for percentage calulation");
        System.out.println("Enter the which calculator you want to use");
        int choice = sc.nextInt();

        switch(choice)
        {
            case 1:
                c.basicCalculator();
                break;
            case 2:
                c.advanceCalulator();
                break;
            case 3:
                c.percentageCalulator();
                break;
            default:
                System.out.println("plz enter the correct value to choose the calculator");
        }

    }
}