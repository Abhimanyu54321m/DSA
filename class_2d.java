package company.Java;
import java.util.*;
public class class_2d {
        public static void main(String[] args) {
            int[][] matrix = new int[6][6];


            for (int i = 0; i < 6; i++) {
                for (int j = 0; j < 6; j++) {
                    matrix[i][j] = i * 10 + j;
                }
            }


            System.out.println("Top-Right Triangle:");
            for (int i = 0; i < 6; i++) {

                for (int s = 0; s < i; s++) {
                    System.out.print("    ");
                }


                for (int j = i; j < 6; j++) {
                    System.out.printf("%02d  ", matrix[i][j]);
                }
                System.out.println();
            }
        }
    }

