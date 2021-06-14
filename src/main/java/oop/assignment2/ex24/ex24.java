/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 first_name last_name
 */

/*
Using functions to abstract the logic away from the rest of your code makes it easier to read and easier to maintain.

Create a program that compares two strings and determines if the two strings are anagrams. The program should prompt for both input strings and display the output as shown in the example that follows.

Example Output
Enter two strings and I'll tell you if they are anagrams:
Enter the first string: note
Enter the second string: tone
"note" and "tone" are anagrams.
Constraints
Implement the program using a function called isAnagram, which takes in two words as its arguments and returns true or false. Invoke this function from your main program.
Check that both words are the same length.
 */

package oop.assignment2.ex24;

import java.util.Scanner;

public class ex24 {
    private static final Scanner in = new Scanner(System.in);

    private static String a;
    private static String b;

    public static void main(String[] args) {
        readUserInput();
        AnagramDetector ad = new AnagramDetector();
        boolean result = ad.isAnagram(a, b);
        String output = output(result, a, b);
        System.out.println(output);
    }

    public static void readUserInput(){
        System.out.println("Enter two strings and I'll tell you if they are anagrams:");
        System.out.print("Enter the first string: ");
        a = in.nextLine();
        System.out.print("Enter the second string: ");
        b = in.nextLine();
    }

    public static String output(boolean result, String a, String b){
        if(result){
            return "\"" + a + "\" and \"" + b + "\" are anagrams.";
        }
        else{
            return "\"" + a + "\" and \"" + b + "\" are not anagrams.";
        }
    }
}
