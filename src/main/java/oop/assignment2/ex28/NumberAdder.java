package oop.assignment2.ex28;

import java.util.Scanner;

public class NumberAdder {

    public int addLoop(double[] n){
        int total = 0;
        for(int i = 0; i < 5; i++){
            total += n[i];
        }
        return total;
    }
}
