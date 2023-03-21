package main;

public class Teszt {
    public static void main(String[] args) {
        new Teszt().rendezesTeszt();
    }
    
    public void rendezesTeszt() {
//        int[] tomb = {3, 69, 420, 14};
        int tomb[] = Program.tombkeszites();
        tomb = Program.sorbaRendezes(tomb);
        
//        boolean kapott = Program.rendezettE(tomb);
//        boolean vart = true;
        
//        assert kapott == vart : "Nincs rendezve!";
        assert Program.rendezettE(tomb) : "Nincs rendezve!";
    }
}
