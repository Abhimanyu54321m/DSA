package company.Java;
import java.util.*;
public class triangle_DT {
    public static void main(String[] args) {
        System.out.println("\n Enter 3 integers which are sides of triangle\n");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        in.close();
        if(a<b+c && b<a+c && c<a+b)
        {
            System.out.println("triangle can be formed");
            if((a==b) && (b==c))
                System.out.println("equilateral triangle");
            else if((a!=b) && (a!=c) && (b!=c))
                System.out.println("scalene triangle");
            else
                System.out.println("isosceles triangle");
        }
            else
        System.out.println("triangle cannot be formed");
    }
}
