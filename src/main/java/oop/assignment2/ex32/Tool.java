package oop.assignment2.ex32;

public class Tool {
    public boolean isValid(String s){
        return s.matches("[1-3]+");
    }

    public int generateNumber(int d){
        if(d == 1){
            return (int)Math.floor(Math.random()*(10)+1);
        }
        else if(d == 2){
            return (int)Math.floor(Math.random()*(100)+1);
        }
        else{
            return (int)Math.floor(Math.random()*(1000)+1);
        }
    }

    //returns true if the guess is lower than the number
    public boolean isLower(int number, int guess){
        return guess < number;
    }

    public boolean isValidGuess(String s){
        return s.matches("[0-9]+");
    }
}
