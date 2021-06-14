package oop.assignment2.ex36;

import java.util.List;

public class Calculator {
    public boolean isValid(String s){
        return (s.matches("[0-9]+") || s.equals("done"));
    }

    public StringBuilder listOfNumbers(List<Integer> l){
        StringBuilder s = new StringBuilder();
        for(int i = 0; i < l.size(); i++){
            s.append((l.get(i)));
            if(i != l.size()-1){
                s.append(", ");
            }
        }
        return s;
    }

    public double average(List<Integer> l){
        int avg = 0;
        for(int i = 0; i < l.size(); i++){
            avg += l.get(i);
        }
        return (double)avg / l.size();
    }

    public int min(List<Integer> l){
        int minIndex = 0;
        int currentMin = 0;
        for(int i = 0; i < l.size(); i++){
            currentMin = i;
            if(l.get(currentMin) < l.get(minIndex)){
                minIndex = i;
            }
        }
        return l.get(minIndex);
    }

    public int max(List<Integer> l){
        int maxIndex = 0;
        int currentMax = 0;
        for(int i = 0; i < l.size(); i++){
            currentMax = i;
            if(l.get(currentMax) > l.get(maxIndex)){
                maxIndex = i;
            }
        }
        return l.get(maxIndex);
    }

    public double std(List<Integer> l, double avg){
        double n = 0;
        for(int i = 0; i < l.size(); i++){
            n += Math.pow(l.get(i) - avg, 2);
        }
        n = Math.sqrt(n/l.size());
        return n;
    }
}
