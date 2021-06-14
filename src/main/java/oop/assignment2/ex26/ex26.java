/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 first_name last_name
 */

/*
It can take a lot longer to pay off your credit card balance than you might realize. And the formula for figuring that out isn’t pretty. Hiding the formula’s complexity with a function can help you keep your code organized.

Write a program that will help you determine how many months it will take to pay off a credit card balance. The program should ask the user to enter the balance of a credit card, the APR of the card, and their monthly payment. The program should then return the number of months needed (rounded up to the next integer value).

The formula for this is

n = -(1/30) * log(1 + b/p * (1 - (1 + i)^30)) / log(1 + i)
where

n is the number of months.
i is the daily rate (APR divided by 365).
b is the balance.
p is the monthly payment.
Example Output
What is your balance? 5000
What is the APR on the card (as a percent)? 12
What is the monthly payment you can make? 100
It will take you 70 months to pay off this card.
Constraints
Prompt for the card’s APR. Do the division internally.
Prompt for the APR as a percentage, not a decimal.
Use a class called PaymentCalculator with a public method called calculateMonthsUntilPaidOff, which returns the number of months.
Round fractions of a cent up to the next cent.
 */

package oop.assignment2.ex26;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class ex26 {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        PaymentCalculator c = new PaymentCalculator();
        double balance = getBalance();
        double APR = getApr()/100;
        double payment = getMonthlyPayment();
        double months = c.calculateMonthsUntilPaidOff(balance, APR, payment);
        System.out.println(output(months));
    }

    private static double getBalance() {
        System.out.print("What is your balance? ");
        return in.nextDouble();
    }

    private static double getApr() {
        System.out.print("What is the APR on the card (as a percent)? ");
        return in.nextDouble();
    }

    private static double getMonthlyPayment() {
        System.out.print("What is the monthly payment you can make? ");
        return in.nextDouble();
    }

    private static String output(double months){
        DecimalFormat d = new DecimalFormat("#");
        d.setRoundingMode(RoundingMode.UP);
        return "It will take you " + d.format(months) + " months to pay off this card.";
    }
}
