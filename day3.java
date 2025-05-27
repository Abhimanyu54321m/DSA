package company.Java;
import java.util.*;
public class day3 {
    public static void main(String[] args) {
//        int age = 16;
//        if(age >= 18) {
//            System.out.println("adult : drive, vote");
//        }
//        if(age > 13 && age <18){
//            System.out.println("teenager");
//        }
//        else {
//            System.out.println("not adult");
//        }

        // Print the largest of 2

//        int a = 1;
//        int b = 3;
//
//        if(a > b){
//            System.out.println("A");
//        }else{
//            System.out.println("B");
//        }

        // print even or odd

//        int n = 4;
//
//        if(n % 2 == 0){
//            System.out.println("even");
//        }else{
//            System.out.println("odd");
//        }
        // else if condition

//        int age = 13;
//
//        if(age >= 18) {
//            System.out.println("adult");
//        }
//        else if(age >= 13 && age < 18) {
//            System.out.println("teenager");
//        }
//        else {
//            System.out.println("child");
//        }

        // Income Tax calculator

//        Scanner sc = new Scanner(System.in);
//        int income = sc.nextInt();
//        int tax;
//        if(income < 500000){
//             tax = 0;
//            System.out.println("total tax is 0% : " +tax);
//        }else if(income >= 500000 && income < 1000000){
//            tax = (income * 20/100);
//            System.out.println("total tax is 20% : " +tax);
//        }
//        else{
//             tax = (income * 30/100);
//            System.out.println("total tax is 30% : " +tax);
//        }

        // Print the largest of 3

//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter the number A");
//        int a = sc.nextInt();
//        System.out.println("enter the number B");
//        int b = sc.nextInt();
//        System.out.println("enter the number C");
//        int c = sc.nextInt();
//
//        if(a >= b && a>= c){
//            System.out.println("the largest number is A");
//        }else if(b >= c){
//            System.out.println("the largest number is B");
//        }else{
//            System.out.println("the largest number is C");
//        }

        // ternary operator

//        int number = 4;
//
//       String type = ((number%2) == 0)  ? "even" : "odd";
//        System.out.println(type);

        // check if a student will Pass or Fail

//        int marks = 45;
//
//        String Rc = (marks>= 33) ? "PASS" : "FAIL";
//        System.out.println(Rc);

        // switch statement

//        int number = 2;
//
//        switch(number) {
//            case 1 :
//                System.out.println("samosa");
//                break;
//            case 2 :
//                System.out.println("burger");
//                break;
//            case 3 :
//                System.out.println("mango shake");
//                break;
//            default:
//                System.out.println("we wake up");
//        }

        // print calculator

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter A");
//        int a = sc.nextInt();
//        System.out.println("Enter B");
//        int b = sc.nextInt();
//        System.out.println("Enter operator");
//        char operator = sc.next().charAt(0);
//
//        switch(operator) {
//            case '+' :
//                System.out.println(a+b);
//                break;
//            case '-' :
//                System.out.println(a-b);
//                break;
//            case '*' :
//                System.out.println(a*b);
//                break;
//            case '/' :
//                System.out.println(a/b);
//                break;
//            case '%' :
//                System.out.println(a%b);
//                break;
//            default:
//                System.out.println("wrong operator");
//        }

        // Assignment problem


        // Question 1

//        int num = 4;
//
//        if(num > 0){
//            System.out.println("number is positive");
//        }else {
//            System.out.println("number is negative");
//        }

        // Question 2

//        double temp = 103.5;
//
//        if(temp >= 100){
//            System.out.println("you have fever");
//        } else {
//            System.out.println("you have not fever");
//        }

        // Question 3

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the day");
//        int day = sc.nextInt();
//
//        switch(day) {
//            case 1 :
//                System.out.println("Monday");
//                break;
//            case 2 :
//                System.out.println("Tuesday");
//                break;
//            case 3 :
//                System.out.println("Wednesday");
//                break;
//            case 4 :
//                System.out.println("Thursday");
//                break;
//            case 5 :
//                System.out.println("Friday");
//                break;
//            case 6 :
//                System.out.println("Saturday");
//                break;
//            case 7 :
//                System.out.println("Sunday");
//                break;
//            default:
//                System.out.println("you choose wrong number");
//        }

        // Question 4

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year");
        int year = sc.nextInt();

        if(year% 4 == 0){
            System.out.println("this ia a leap year");
        }else {
            System.out.println("thia is a not leap year");
        }
    }
}
