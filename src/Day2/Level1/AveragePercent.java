package Day2.Level1;

public class AveragePercent {
    public static void main(String[] args) {
        int mathsMark=94;
        int PhysicsMark=95;
        int ChemistryMark=96;
        double Average=((mathsMark+PhysicsMark+ChemistryMark)/3);
        double percent=(Average*100)/100;
        System.out.println("Sam's average marks in PCM is "+percent+"%");

    }
}
