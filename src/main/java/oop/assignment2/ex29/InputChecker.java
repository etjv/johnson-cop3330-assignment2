package oop.assignment2.ex29;

public class InputChecker {
    public boolean isValid(String s){
        if(!s.matches("[0-9]+") || s.equals("0") || s.equals("")){
            return false;
        }
        return true;
    }
}
