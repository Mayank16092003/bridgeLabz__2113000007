package Day5_27_01_2025.Level1;
import java.util.Scanner;
public class AthleteRun {
    public float rounds(int sideA, int sideB, int sideC){
        int perimeter;
        perimeter=sideA+sideB+sideC;
        return (float) perimeter/5f;
    }
    public static void main(String[] args){
        int sideA,sideB,sideC;
        Scanner input = new Scanner(System.in);
        sideA=input.nextInt();
        sideB=input.nextInt();
        sideC=input.nextInt();
        AthleteRun ar=new AthleteRun();
        System.out.println("ahletes need to complete near about "+ar.rounds(sideA,sideB,sideC)+" rounds");
    }
}
