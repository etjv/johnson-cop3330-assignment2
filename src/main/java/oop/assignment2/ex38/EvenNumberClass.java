package oop.assignment2.ex38;


public class EvenNumberClass {
    public String[] killTheOdds(String[] list){
        String[] newList = new String[list.length];

        int j = 0;
        int evens = 0;
        for(int i = 0; i < list.length; i++){
            if(Integer.parseInt(list[i]) % 2 == 0){
                newList[j] = list[i];
                evens++;
                j++;
            }
        }
        String[] newList2 = new String[evens];
        for(int i = 0; i < evens; i++){
            newList2[i] = newList[i];
        }
        return newList2;
    }

    public StringBuilder putTheNumbersTogether(String[] s){
        StringBuilder condensed = new StringBuilder();
        for(int i = 0; i < s.length; i++){
            condensed.append(s[i]);
            if(i != s.length - 1){
                condensed.append(" ");
            }
        }
        return condensed;
    }

    public String getOutput(StringBuilder s){
        return "The even numbers are " + s.toString() + ".";
    }
}
