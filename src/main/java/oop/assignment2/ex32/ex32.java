/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 first_name last_name
 */

/*
Write a Guess the Number game that has three levels of difficulty. The first level of difficulty would be a number between 1 and 10. The second difficulty set would be between 1 and 100. The third difficulty set would be between 1 and 1000.

Prompt for the difficulty level, and then start the game. The computer picks a random number in that range and prompts the player to guess that number. Each time the player guesses, the computer should give the player a hint as to whether the number is too high or too low. The computer should also keep track of the number of guesses. Once the player guesses the correct number, the computer should present the number of guesses and ask if the player would like to play again.

Example Output
Let's play Guess the Number!

Enter the difficulty level (1, 2, or 3): 1
I have my number. What's your guess? 5
Too low. Guess again: 7
Too low. Guess again: 9
You got it in 3 guesses!

Do you wish to play again (Y/N)? y

Enter the difficulty level (1, 2, or 3): 3
I have my number. What's your guess? 500
Too low. Guess again: 750
Too high. Guess again: 600
Too low. Guess again: 700
Too low. Guess again: 725
Too high. Guess again: 715
Too high. Guess again: 710
Too high. Guess again: 705
Too high. Guess again: 701
Too low. Guess again: 702
You got it in 10 guesses!

Do you wish to play again (Y/N)? n
Constraints
Don’t allow any non-numeric data entry.
During the game, count non-numeric entries as wrong guesses.
 */

package oop.assignment2.ex32;

import java.util.Scanner;

public class ex32 {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Tool t = new Tool();
        boolean game = true;
        String s;
        int difficulty;
        int number;
        int guess;
        int totalGuesses;
        System.out.println("Let's play Guess the Number!\n");
        while(game){
            difficulty = getDifficulty();
            number = t.generateNumber(difficulty);
            guess = 0;
            totalGuesses = 0;
            System.out.print("I have my number. What's your guess? ");
            while(guess != number){
                s = in.nextLine();
                if(!t.isValidGuess(s)){
                    System.out.print("Invalid guess. Guess again: ");
                    totalGuesses += 1;
                    continue;
                }
                else{
                    guess = Integer.parseInt(s);
                    if(t.isLower(number, guess)){
                        System.out.print("Too low. Guess again: ");
                    }
                    else if(number == guess){
                        break;
                    }
                    else{
                        System.out.print("Too high. Guess again: ");
                    }
                }
                totalGuesses += 1;
            }
            totalGuesses += 1;
            System.out.println("You got it in " + totalGuesses + " guesses!\n");
            System.out.print("Do you wish to play again (Y/N)? ");
            s = in.nextLine();
            if(s.equals("N") || s.equals("n")){
                game = false;
            }
            System.out.print("\n");
        }
    }

    private static int getDifficulty(){
        Tool t = new Tool();
        System.out.print("Enter the difficulty level (1, 2, or 3): ");
        String s = in.nextLine();
        if(!t.isValid(s)){
            System.out.println("Invalid difficulty level.");
            return getDifficulty();
        }
        return Integer.parseInt(s);
    }
}
