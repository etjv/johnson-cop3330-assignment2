/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 first_name last_name
 */

/*
The rule of 72 is a quick method for estimating how long it will take to double your investment, by taking the number 72 and dividing it by the expected rate of return. It’s a good tool that helps you figure out if the stock, bond, or savings account is right for you. It’s also a good program to write to test for and prevent bad input because computers can’t divide by zero. And instead of exiting the program when the user enters invalid input, you can just keep prompting for inputs until you get one that’s valid.

Write a quick calculator that prompts for the rate of return on an investment and calculates how many years it will take to double your investment.

The formula is

years = 72 / r
where r is the stated rate of return.

Example Output
What is the rate of return? 0
Sorry. That's not a valid input.
What is the rate of return? ABC
Sorry. That's not a valid input.
What is the rate of return? 4
It will take 18 years to double your initial investment.
Constraints
Don’t allow the user to enter 0.
Don’t allow non-numeric values.
Use a loop to trap bad input, so you can ensure that the user enters valid values.
 */

package oop.assignment2.ex29;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class ex29 {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        double rateOfReturn = getInput();
        System.out.println(output(rateOfReturn));
    }


    private static double getInput(){
        InputChecker c = new InputChecker();
        System.out.print("What is the rate of return? ");
        String s = in.nextLine();
        while(!c.isValid(s)){
            System.out.print("Sorry. That's not a valid input.\nWhat is the rate of return? ");
            s = in.nextLine();
        }
        return Double.parseDouble(s);
    }

    private static String output(double rateOfReturn) {
        DecimalFormat d = new DecimalFormat("#");
        d.setRoundingMode(RoundingMode.UP);
        return "It will take " + d.format(72/rateOfReturn) + " years to double your initial investment.";
    }


}
