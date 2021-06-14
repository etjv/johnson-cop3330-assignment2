package oop.assignment2.ex37;

public class PasswordGenerator {
    private static int numberTracker = 0;
    private static int specialCharTracker = 0;
    private static int lengthTracker = 0;

    public char letterGenerator(){
        return (char)(Math.floor(Math.random()*(122-97)+97));
    }

    public char specialCharacterGenerator(){
        int i = (int)(Math.floor(Math.random()*(4)+1));
        switch(i){
            default:
                return 'a';
            case 1:
                return '?';
            case 2:
                return '#';
            case 3:
                return '$';
            case 4:
                return '&';
        }

    }

    public char numberGenerator(){
        return (char)(Math.floor(Math.random()*(58-48)+48));
    }

    public int typeOfCharGenerator(){
        return (int)(Math.floor(Math.random()*(3)+1));
    }

    public String passwordBuilder(StringBuilder s, int length, int specialChars, int numbers, int j){
        int i = typeOfCharGenerator();
        if(j == length){
            return String.valueOf(s);
        }
        if(i == 1){
            if(lengthTracker < length - (specialChars + numbers)){
                s.append(letterGenerator());
                lengthTracker += 1;
                return passwordBuilder(s, length, specialChars, numbers, j + 1);
            }
            else{
                return passwordBuilder(s, length, specialChars, numbers, j);
            }
        }
        else if(i == 2){
            if(numberTracker < numbers){
                s.append(numberGenerator());
                numberTracker += 1;
                return passwordBuilder(s, length, specialChars, numbers, j + 1);
            }
            else{
                return passwordBuilder(s, length, specialChars, numbers, j);
            }
        }
        else if(i == 3){
            if(specialCharTracker < specialChars){
                s.append(specialCharacterGenerator());
                specialCharTracker += 1;
                return passwordBuilder(s, length, specialChars, numbers, j + 1);
            }
            else{
                return passwordBuilder(s, length, specialChars, numbers, j);
            }
        }
        return String.valueOf(s);
    }
}
