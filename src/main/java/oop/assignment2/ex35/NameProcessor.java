package oop.assignment2.ex35;


import java.util.ArrayList;

public class NameProcessor {
    // returns true if the name isn't "";
    public boolean isName(String s){
        return !s.equals("");
    }

    public int numberGenerator(int s){
        return (int)Math.floor(Math.random()*(s)+0);
    }

    public String winnerChooser(ArrayList<String> s){
        return "The winner is... " + s.get(numberGenerator(s.size())) + ".";
    }

    public boolean numberIsLessThanSize(int n, int s){
        return n < s;
    }




}
