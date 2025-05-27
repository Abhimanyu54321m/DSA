package company.Java;
import java.util.*;
public class day1 {
    public static void main(String[] args) {
        // output in java
//        System.out.println("Hello world");
//        System.out.println("*****");
//        System.out.println("****");
//        System.out.println("***");
//        System.out.println("**");
//        System.out.println("*");
        // Variables in java
//        int a = 5;
//        int b = 10;
//        System.out.println(a);
//        System.out.println(b);
//
//         a = 50;
//        System.out.println(a);
        // Data Types in java

//        byte b = 8;
//        System.out.println(b);
//        char ch = 'a';
//        System.out.println(ch);
//         boolean var = false;
//         double price = 10.5;

         // sum of a and b

//        int a = 10;
//        int b = 5;
//        int sum = a+b;
//        System.out.println(sum);

        Scanner sc = new Scanner(System.in);
//        String input = sc.next();
//        System.out.println(input);

//        String name = sc.nextLine();
//        System.out.println(name);

//        int number = sc.nextInt();
//        System.out.println(number);

        // sum of a and b using input

//        System.out.println("Enter the first number");
//        int a = sc.nextInt();
//        System.out.println("Enter the second number");
//        int b = sc.nextInt();
//        int sum = a+b;
//        System.out.println("the sum is : " +sum);

        // product of a and b using input

//        System.out.println("Enter the first number");
//        int a = sc.nextInt();
//        System.out.println("Enter the second number");
//        int b = sc.nextInt();
//        int product = a * b;
//        System.out.println("the product is : " +product);

        // find the area of circle using input

//        System.out.println("Enter the radius");
//        int radius = sc.nextInt();
//        float area = 3.14f * radius * radius;
//        System.out.println("Area of circle is : " +area);

        // Type conversion in java

//        int a = 25;
//        long b = a;
//        System.out.println(b);
//        float number = sc.nextInt();
//        System.out.println(number);

        // Type casting in java

//        float a = 25.12f;
//        int b = (int)a;
//        System.out.println(b);

//        char ch = 'a';
//        char ch2 = 'b';
//        int number = ch;
//        int number2 = ch2;
//        System.out.println(number);
//        System.out.println(number2);

        // Type promotion in java

//        char a = 'a';
//        char b = 'b';
//        System.out.println((int)(b));
//        System.out.println((int)(a));
//        System.out.println(a);
//        System.out.println(b-a);

//        int a = 10;
//        float b = 20.25f;
//        long c = 30;
//        double ans = a + b + c;
//        System.out.println(ans);

        //Assignment problem
        // Question no 1

//        System.out.println("Enter the first number");
//        int a = sc.nextInt();
//        System.out.println("Enter the second number");
//        int b = sc.nextInt();
//        System.out.println("Enter the third number");
//        int c = sc.nextInt();
//        int sum = a + b + c;
//        int Average = sum/3;
//        System.out.println("Average of three number is : " +Average);

        // Question no 2

//        System.out.println("Enter the side of a square");
//        int side = sc.nextInt();
//        int Area = side * side;
//        System.out.println("Area of square is : " +Area);

        // Question no 3

        System.out.println("Enter the price of pencil");
        int pencil = sc.nextInt();
        System.out.println("Enter the price if pen");
        int pen = sc.nextInt();
        System.out.println("Enter the price of eraser");
        int eraser = sc.nextInt();
        int totalCost = pencil + pen + eraser;
        int gst = totalCost * 18/100;
        int All = totalCost + gst;
        System.out.println("THe total price is including gst is : " +All);
    }
}
