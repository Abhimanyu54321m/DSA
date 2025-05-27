package company.Java;
import java.util.*;
public class Assignment_two_DimensionArray {
    public static void main(String[] args) {
        int matrix[][] = {{1, 4, 9},
                          {11, 4, 3},
                           {2, 2, 3}};
        //int target = 7;
        int sum = 0;
//        for(int i=0; i<matrix.length; i++){
//            for(int j=0; j<matrix[0].length; j++){
//                if(matrix[i][j] == target){
//                    sum++;
//                }
//            }
//        }
//        System.out.println(sum);
        // Question 2
//        for(int i=0; i<matrix[0].length; i++){
//            sum += matrix[matrix.length-2][i];
//        }
//        System.out.println(sum);

        // Question 3

        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                System.out.print(matrix[j][i] +" ");
            }
            System.out.println();
        }
    }
}
