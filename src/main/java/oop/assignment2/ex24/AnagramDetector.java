package oop.assignment2.ex24;

import java.util.Arrays;

public class AnagramDetector {
    public boolean isAnagram(String a, String b) {
        int n1 = a.length();
        int n2 = b.length();
        if(n1 == n2){
            char[] first = a.toCharArray();
            char[] second = b.toCharArray();
            Arrays.sort(first);
            Arrays.sort(second);
            return Arrays.equals(first, second);
        }
        return false;
    }
}
