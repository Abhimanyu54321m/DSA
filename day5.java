package company.Java;
import java.util.*;
public class day5 {
    public static void main(String[] args) {
//         for(int i = 1; i<=4; i++){
//             for(int j = 1; j<=i; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }

        // print inverted star pattern

//        for(int i = 4; i>=1; i--){
//            for(int j = 1; j<=i; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        // print half pyramid

//        int n = 5;
//        for(int i = 1; i<=n; i++){
//            for(int j = 1; j<=i; j++){
//                System.out.print(j +" ");
//            }
//            System.out.println();
//        }

        // print character pattern

//        int n = 4;
//        char ch = 'A';
//
//        for(int i=1; i<=n; i++){
//            for(int j=1; j<=i; j++){
//                System.out.print(ch);
//                ch++;
//            }
//            System.out.println();
//        }

        int n1 = 5;
        int val = 1;

        for(int i=1; i<=n1; i++){
            for(int j=1; j<=i; j++){
                System.out.print(val +" ");
                val++;
            }
            System.out.println();
        }
    }
}
