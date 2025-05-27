package company.Java;
import java.util.*;
public class day7 {
    public static void hollow_rectangle(int totalRows, int totCols) {
        for(int i = 1; i<=totalRows; i++){
            for(int j = 1; j<=totCols; j++){
                if(i == 1 || i == totalRows || j==1 || j == totCols) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    // Inverted and rotated half pyramid
    public static void inverted_rotated_half_pyramid(int n) {
        int s = 2;
        for(int i=n-1; i>=1; i--){
            // spaces
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            // stars
            for(int j=1; j<=i; j++){
                System.out.print(s +" ");
                s++;
            }
            System.out.println();
        }
    }
   public static void inverted_half_pyramid(int n) {
        for(int i=n; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print(j +" ");
            }
            System.out.println();
        }
   }

   public static void floyd_triangle(int n){
        int count = 1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(count +" ");
                count++;
            }
            System.out.println();
        }
   }

   public static void zero_one_triangle(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                if((i+j) % 2 == 0){
                    System.out.print("1" +" ");
                }else{
                    System.out.print("0" +" ");
                }
            }
            System.out.println();
        }
   }

   public static void butterfly_pattern(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
       for(int i=n; i>=1; i--){
           for(int j=1; j<=i; j++){
               System.out.print("*");
           }
           for(int j=1; j<=2*(n-i); j++){
               System.out.print(" ");
           }
           for(int j=1; j<=i; j++){
               System.out.print("*");
           }
           System.out.println();
       }
   }

   public static void solid_rhombus(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
   }

   public static void hollow_rhombus(int n){
         for(int i=1; i<=n; i++){
             for(int j=1; j<=n-i; j++){
                 System.out.print(" ");
             }
             for(int j=1; j<=n; j++){
                 if(i == 1 || i == n || j == 1 || j == n){
                     System.out.print("*");
                 }else{
                     System.out.print(" ");
                 }
             }
             System.out.println();
         }
   }

   public static void diamond(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }
            for(int j=1; j<=(2*i)-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
       for(int i=n; i>=1; i--){
           for(int j=1; j<=n-i; j++){
               System.out.print(" ");
           }
           for(int j=1; j<=(2*i)-1; j++){
               System.out.print("*");
           }
           System.out.println();
       }
   }
    public static void main(String[] args) {
      // hollow_rectangle(7,9);
       // inverted_rotated_half_pyramid(4);
       // inverted_half_pyramid(5);
        //floyd_triangle(5);
        //zero_one_triangle(5);
        // butterfly_pattern(4);
        //solid_rhombus(5);
       // hollow_rhombus(5);
       // diamond(5);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
          int s = 2;
        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i || i == rows) {
                    System.out.print(s +" ");
                    s++;
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
