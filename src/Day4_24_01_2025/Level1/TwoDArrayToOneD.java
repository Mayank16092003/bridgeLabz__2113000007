package Day4_24_01_2025.Level1;
import java.util.Scanner;
public class TwoDArrayToOneD {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of rows and columns");
        int row=sc.nextInt();
        int column=sc.nextInt();
        int[][] matrix=new int[row][column];
        int[] array=new int[row*column];
        System.out.println("enter elements for 2-D matrix");
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        int k=0;
        System.out.println("2-D matrix element's is ");
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                System.out.print(matrix[i][j]+" ");
                array[k++]=matrix[i][j];
            }
            System.out.println();
        }
        System.out.print("1-D matrix element's is ");
        for(int i=0;i<array.length;i++)
            System.out.print(array[i]+" ");
    }
}
