/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 first_name last_name
 */

/*
Sometimes you have to locate and remove an entry from a list based on some criteria. You may have a deck of cards and need to discard one so it’s no longer in play, or you may need to remove values from a list of valid inputs once they’ve been used. Storing the values in an array makes this process easier. Depending on your language, you may find it safer and more efficient to create a new array instead of modifying the existing one.

Create a small program that contains a list of employee names. Print out the list of names when the program runs the first time. Prompt for an employee name and remove that specific name from the list of names. Display the remaining employees, each on its own line.

Example Output
There are 5 employees:
John Smith
Jackie Jackson
Chris Jones
Amanda Cullen
Jeremy Goodwin

Enter an employee name to remove: Chris Jones

There are 4 employees:
John Smith
Jackie Jackson
Amanda Cullen
Jeremy Goodwin
Constraint
Use an array or list to store the names.
 */


package oop.assignment2.ex34;

import java.util.ArrayList;
import java.util.Scanner;

public class ex34 {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        NameTool t = new NameTool();
        ArrayList<String> employees = addEmployees();
        t.namePrinter(employees);
        String nameToDelete = getName();
        t.deleteName(employees, nameToDelete);
        t.namePrinter(employees);
    }

    private static ArrayList<String> addEmployees(){
        ArrayList<String> list = new ArrayList<String>();
        list.add("John Smith");
        list.add("Jackie Jackson");
        list.add("Chris Jones");
        list.add("Amanda Cullen");
        list.add("Jeremy Goodwin");
        return list;
    }

    private static String getName(){
        System.out.print("Enter an employee name to remove: ");
        return in.nextLine();
    }
}
