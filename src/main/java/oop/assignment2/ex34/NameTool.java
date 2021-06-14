package oop.assignment2.ex34;

import java.util.ArrayList;


public class NameTool {
    public void namePrinter(ArrayList<String> l){
        int n = l.size();
        System.out.println("There are "+ n +" employees:");
        for(int i = 0; i < n; i++){
            System.out.println(l.get(i));
        }
    }

    public void deleteName(ArrayList<String> l, String name){
        int index = 0;
        for(int i = 0; i < l.size(); i++){
            if(name.equals(l.get(i))){
                index = i;
            }
        }
        l.remove(index);
    }
}
