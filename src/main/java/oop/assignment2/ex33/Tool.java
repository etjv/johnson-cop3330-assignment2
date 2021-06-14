package oop.assignment2.ex33;

import java.util.ArrayList;
import java.util.List;

public class Tool {
    public int numberGenerator(){
        return (int)Math.floor(Math.random()*(4)+0);
    }

    public String ballOutput(int n){
        List<String> responses = new ArrayList<String>();
        responses.add("Yes.");
        responses.add("No.");
        responses.add("Maybe.");
        responses.add("Ask again later.");
        return responses.get(n);
    }
}
