/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 first_name last_name
 */

/*
Coming up with a password that meets specific requirements is something your computer can do. And it will give you practice using random number generators in conjunction with a list of known values.

Create a program that generates a secure password. Prompt the user for the minimum length, the number of special characters, and the number of numbers. Then generate a password for the user using those inputs.

Example Output
What's the minimum length? 8
How many special characters? 2
How many numbers? 2
Your password is aurn2$1s#
Constraints
Use lists to store the characters you’ll use to generate the passwords.
Ensure that the generated password is random.
Ensure that there are at least as many letters are there are special characters and number.
 */

package oop.assignment2.ex37;

import java.util.Scanner;

public class ex37 {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int length = getLength();
        int specialCharacters = getSpecialCharacters();
        int numbers = getNumbers();
        int j = 0;
        System.out.print(getOutput(length, specialCharacters, numbers, j));
    }

    private static int getLength(){
        System.out.print("What's the minimum length? ");
        String s = in.nextLine();
        if(!s.matches("[0-9]+")){
            System.out.println("Invalid input.");
            return getLength();
        }
        return Integer.parseInt(s);
    }

    private static int getSpecialCharacters(){
        System.out.print("How many special characters? ");
        String s = in.nextLine();
        if(!s.matches("[0-9]+")){
            System.out.println("Invalid input.");
            return getSpecialCharacters();
        }
        return Integer.parseInt(s);
    }

    private static int getNumbers(){
        System.out.print("How many numbers? ");
        String s = in.nextLine();
        if(!s.matches("[0-9]+")){
            System.out.println("Invalid input.");
            return getNumbers();
        }
        return Integer.parseInt(s);
    }

    private static String getOutput(int l, int sc, int n, int j){
        PasswordGenerator p = new PasswordGenerator();
        StringBuilder s = new StringBuilder();
        return "Your password is " + p.passwordBuilder(s, l, sc, n, j);
    }
}
