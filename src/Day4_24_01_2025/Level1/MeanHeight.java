package Day4_24_01_2025.Level1;
import java.util.Scanner;
public class MeanHeight {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double[] heights=new double[11];
        System.out.println("Enter height of 11 players: ");
        double sum=0.0,meanHeight=0.0;
        for(int i=0;i<11;i++){
            heights[i]=sc.nextDouble();
            sum+=heights[i];
        }
        meanHeight=sum/11;
        System.out.println("mean height of all 11 players is "+meanHeight);

    }
}
