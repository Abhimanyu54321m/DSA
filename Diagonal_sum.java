package company.Java;
import java.util.*;
public class Diagonal_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows : ");
        int row = sc.nextInt();
        System.out.println("Enter the column : ");
        int column = sc.nextInt();
        int matrix[][] = new int[row][column];
        int sum = 0;

        System.out.println("Enter the input");
        for(int i=0; i<row; i++) {
            for (int j = 0; j < column; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
//        for (int i = 0; i < row; i++) {
//            for (int j = 0; j < column; j++) {
//               if(i==j){
//                   sum += matrix[i][j];
//               }else if(i+j == matrix.length-1){
//                   sum += matrix[i][j];
//               }
//            }
//        }
        // optimize code

        for(int i=0; i<matrix.length; i++){
            // primary diagonal
            sum+= matrix[i][i];
            // secondary diagonal
            if(i != matrix.length-1-i){
                sum += matrix[i][matrix.length-i-1];
            }
        }
        System.out.println("diagonal sum is : " +sum);
    }
}
