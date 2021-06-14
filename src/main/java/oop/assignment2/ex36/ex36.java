/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 first_name last_name
 */

/*
Statistics is important in our field. When measuring response times or rendering times, it’s helpful to collect data so you can easily spot abnormalities. For example, the standard deviation helps you determine which values are outliers and which values are within normal ranges.

Write a program that prompts for response times from a website in milliseconds. It should keep asking for values until the user enters “done.”

The program should print the average time (mean), the minimum time, the maximum time, and the population standard deviation.

Example Output
Enter a number: 100
Enter a number: 200
Enter a number: 1000
Enter a number: 300
Enter a number: done
Numbers: 100, 200, 1000, 300
The average is 400.0
The minimum is 100
The maximum is 1000
The standard deviation is 353.55
Constraints
Use functions called average, max, min, and std, which take in a list of numbers and return the results.
Use loops and arrays to perform the input and mathematical operations.
Be sure to exclude the "done" entry from the inputs.
Be sure to properly ignore any invalid inputs.
Keep the input separate from the processing and the output.
 */

package oop.assignment2.ex36;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ex36 {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Calculator c = new Calculator();
        ArrayList<Integer> l = new ArrayList<>();
        String s = "";
        while(!s.equals("done")){
            s = addNumber();
            if(s.equals("done")){
                break;
            }
            else if(c.isValid(s)){
                l.add(Integer.parseInt(s));
            }
        }
        System.out.println(printNumbers(l));
        System.out.println(printAvg(l));
        System.out.println(printMin(l));
        System.out.println(printMax(l));
        System.out.println(printSTD(l));
    }

    private static String addNumber(){
        Calculator c = new Calculator();
        System.out.print("Enter a number: ");
        String s = in.nextLine();
        if(c.isValid(s)){
            return s;
        }
        else{
            System.out.println("Invalid input.");
            return addNumber();
        }
    }

    private static String printNumbers(List<Integer> l){
        Calculator c = new Calculator();
        return "Numbers: " + c.listOfNumbers(l);
    }

    private static String printAvg(List<Integer> l){
        Calculator c = new Calculator();
        double avg = c.average(l);
        return "The average is " + avg;
    }

    private static String printMin(List<Integer> l){
        Calculator c = new Calculator();
        int min = c.min(l);
        return "The minimum is " + min;
    }

    private static String printMax(List<Integer> l){
        Calculator c = new Calculator();
        int max = c.max(l);
        return "The maximum is " + max;
    }

    private static String printSTD(List<Integer> l){
        DecimalFormat d = new DecimalFormat("#.##");
        Calculator c = new Calculator();
        double std = c.std(l, c.average(l));
        return "The standard deviation is " + d.format(std);
    }
}
