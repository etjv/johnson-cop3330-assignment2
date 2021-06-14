package oop.assignment2.ex30;

public class TableGenerator {
    public void Generator(){
        int d;
        String s;
        for(int i = 1; i < 13; i++){
            for(int j = 1; j < 13; j++){
                d = i * j;
                s = String.valueOf(d);
                if(s.length() == 1){
                    System.out.print("    ");
                }
                else if(s.length() == 2){
                    System.out.print("   ");
                }
                else if(s.length() == 3){
                    System.out.print("  ");
                }
                System.out.print(d);
            }
            System.out.print("\n");
        }
    }
}
