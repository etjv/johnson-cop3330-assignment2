package oop.assignment2.ex31;

import java.text.DecimalFormat;

public class TableGenerator {
    public void generateTable(int pulse, int age){
        System.out.println("Resting Pulse : " + pulse + "\t Age: "+ age + "\n\nIntensity\t| Rate\n------------|--------");
        double bpm;
        DecimalFormat d = new DecimalFormat("#");
        for(int i = 55; i < 100; i += 5){
            bpm = (((220 - age) - pulse) * i/100) + pulse;
            System.out.println(i + "%\t\t\t| " + d.format(bpm) + " bmp");
        }
    }
}
