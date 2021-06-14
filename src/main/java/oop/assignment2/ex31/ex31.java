/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 first_name last_name
 */

/*
When you loop, you can control how much you increment the counter; you don’t always have to increment by one.

When getting into a fitness program, you may want to figure out your target heart rate so you don’t overexert yourself. The Karvonen heart rate formula is one method you can use to determine your rate. Create a program that prompts for your age and your resting heart rate. Use the Karvonen formula to determine the target heart rate based on a range of intensities from 55% to 95%. Generate a table with the results as shown in the example output. The formula is

TargetHeartRate = (((220 − age) − restingHR) × intensity) + restingHR
Example Output
Resting Pulse: 65        Age: 22

Intensity    | Rate
-------------|--------
55%          | 138 bpm
60%          | 145 bpm
65%          | 151 bpm
:               :        (extra lines omitted)
85%          | 178 bpm
90%          | 185 bpm
95%          | 191 bpm
Constraints
Don’t hard-code the percentages. Use a loop to increment the percentages from 55 to 95.
Ensure that the heart rate and age are entered as numbers. Don’t allow the user to continue without entering valid inputs.
Display the results in a tabular format.
 */

package oop.assignment2.ex31;

import java.util.Scanner;

public class ex31 {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        TableGenerator t = new TableGenerator();
        int restingPulse = getRestingPulse();
        int age = getAge();
        t.generateTable(restingPulse, age);
    }

    private static int getAge(){
        System.out.print("What is your age? ");
        String s = in.nextLine();
        if(!s.matches("[0-9]+")){
            System.out.println("Invalid input.");
            return getAge();
        }
        else{
            return Integer.parseInt(s);
        }
    }

    private static int getRestingPulse(){
        System.out.print("What is your resting heart rate? ");
        String s = in.nextLine();
        if(!s.matches("[0-9]+")){
            System.out.println("Invalid input.");
            return getRestingPulse();
        }
        else{
            return Integer.parseInt(s);
        }
    }

}
