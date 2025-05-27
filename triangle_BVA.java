package company.Java;
import java.util.*;
public class triangle_BVA {
    public static void main(String[] args) {
        int t=0;
        System.out.println("Enter 3 integers which are sides of triangle\n");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        in.close();
        if(a<0 || a>10)
        {
            System.out.println("a is out of range");
            t=1;
        }
        if(b<0 || b>10)
        {
            System.out.println("b is out of range");
            t=1;
        }
        if(c<0 || c>10)
        {
            System.out.println("c is out of range");
            t=1;
        }
        if(!(t==1))
        {
            if(a<b+c && b<a+c && c<a+b)
            {
                System.out.println("triangle can be formed\n");
                if((a==b)&&(b==c))
                    System.out.println("Equilateral triangle");
                else if((a!=b)&&(a!=c)&&(b!=c))
                    System.out.println("Scalene triangle");
                else
                    System.out.println("Isosceles triangle");
            }
            else
                System.out.println("triangle cannot be formed");
        }
        else
            return;
    }
}
