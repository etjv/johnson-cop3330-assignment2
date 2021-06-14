/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 first_name last_name
 */

/*
Arrays don’t have to be hard-coded. You can take user input and store it in an array and then work with it.

Create a program that picks a winner for a contest or prize drawing. Prompt for names of contestants until the user leaves the entry blank. Then randomly select a winner.

Example Output
Enter a name: Homer
Enter a name: Bart
Enter a name: Maggie
Enter a name: Lisa
Enter a name: Moe
Enter a name:
The winner is... Maggie.
Constraints
Use a loop to capture user input into an array.
Use a random number generator to pluck a value from the array.
Don’t include a blank entry in the array.
Some languages require that you define the length of the array ahead of time. You may need to find another data structure, like an ArrayList.
 */

package oop.assignment2.ex35;

import java.util.ArrayList;
import java.util.Scanner;

public class ex35 {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<String> s = new ArrayList<String>();
        NameProcessor n = new NameProcessor();
        String nameBeingAdded = "a";
        while(n.isName(nameBeingAdded)){
            nameBeingAdded = addName();
            if(n.isName(nameBeingAdded)){
                s.add(nameBeingAdded);
            }
            else{
                break;
            }
        }
        System.out.print(n.winnerChooser(s));
    }

    public static String addName(){
        System.out.print("Enter a name: ");
        return in.nextLine();
    }

}
