/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 first_name last_name
 */

/*
In previous programs, you asked the user for repeated input by writing the input statements multiple times. But it’s more efficient to use loops to deal with repeated input.

Write a program that prompts the user for five numbers and computes the total of the numbers.

Example Output
Enter a number: 1
Enter a number: 2
Enter a number: 3
Enter a number: 4
Enter a number: 5
The total is 15.
Constraints
The prompting must use repetition, such as a counted loop, not three separate prompts.
Create a flowchart before writing the program.
 */

package oop.assignment2.ex28;

import java.util.Scanner;

public class ex28 {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        NumberAdder n = new NumberAdder();
        double[] numbers = getNumbers();
        int a = n.addLoop(numbers);
        System.out.println(output(a));

    }

    private static double[] getNumbers(){
        double[] numbers = new double[5];
        for(int i = 0; i < 5; i++){
            System.out.print("Enter a number: ");
            numbers[i] = in.nextDouble();
        }
        return numbers;
    }

    private static String output(int a){
        return "The total is " + a + ".";
    }
}
