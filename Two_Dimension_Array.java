package company.Java;
import java.util.*;
public class Two_Dimension_Array {
     public static boolean search(int matrix[][], int target){
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j] == target){
                    System.out.println("found at cell (" +i +"," +j +")");
                    return true;
                }
            }
        }
         System.out.println("key not found");
        return false;
     }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows : ");
        int row = sc.nextInt();
        System.out.println("Enter the column : ");
        int column = sc.nextInt();
        int matrix[][] = new int[row][column];

        // input

        for(int i=0; i<row; i++){
            for(int j=0; j<column; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
          // output
        for(int i=0; i<row; i++){
            for(int j=0; j<column; j++){
                System.out.print(matrix[i][j] +" ");
            }
            System.out.println();
        }
        search(matrix, 5);
    }
}
