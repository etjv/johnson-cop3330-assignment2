package oop.assignment2.ex25;

public class PasswordStrengthDetector {
    public int getStrength(String p){
        if(p.length() < 8){
            if(p.matches("[0-9]+")){
                return 1;
            }
            else{
                return 2;
            }
        }
        else{
            if(p.matches("[A-Za-z0-9]+")){
                return 3;
            }
            else{
                return 4;
            }
        }
    }
}
