package main;

import java.util.Random;

public class Program {
    private static final int meret = 6, alsoHatar = 1, felsoHatar = 99;
    private static Random r = new Random();
    
    public static void main(String[] args) {
        System.out.println("2. Buborékrendezés");
        
        
//        for(int i = 0; i < tomb.length; i++) System.out.printf("%d ", tomb[i]);
//        System.out.println("");
//        
//        tomb = sorbaRendezes(tomb);
//        
//        System.out.println(rendezettE(tomb));
    }
    
    public static int[] tombkeszites() {
        int[] tomb = new int[meret];
        for(int i = 0; i < tomb.length; i++) {
            tomb[i] = r.nextInt(alsoHatar, felsoHatar);
        }
        
        return tomb;
    }
    
    public static int[] sorbaRendezes(int[] tomb) {  
        for(int i = meret; i > 0; i--) {
            for(int j = 0; j < i - 1; j++) {
                if(tomb[j] > tomb[j + 1]) {
                    int seged1 = tomb[j], seged2 = tomb[j + 1];
                    tomb[j] = seged2;
                    tomb[j + 1] = seged1;
                }
            }
        }
        
//        for(int i = 0; i < tomb.length; i++) System.out.printf("%d\n", tomb[i]);
        
        return tomb;
    }
    
    public static boolean rendezettE(int[] tomb) {
        int i = 1;
        while(i < tomb.length && !(tomb[i - 1] > tomb[i])) i++;
        boolean rendezett = i == tomb.length;
        
        return rendezett;
    }
}
