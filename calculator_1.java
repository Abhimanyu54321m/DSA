package company.Java;
import java.util.*;
public class calculator_1 {
    public static void main(String[] args) {
        char operator;
        int num1, num2, result;

        Scanner sc = new Scanner(System.in);
        System.out.println("Choose an operator : +,-,*,/");
        operator = sc.next().charAt(0);
        System.out.println("Enter the first number");
        num1 = sc.nextInt();

        System.out.println("Enter the second number");
        num2 = sc.nextInt();

        switch(operator){
            case '+' :
                result = num1 + num2;
                System.out.println(num1 + " + " +num2 +" = " +result);
                break;

            case '-' :
                result = num1 - num2;
                System.out.println(num1 + " - " +num2 +" = " +result);
                break;
            case '*' :
                result = num1 * num2;
                System.out.println(num1 + " * " +num2 +" = " +result);
                break;
            case '/' :
                result = num1/num2;
                System.out.println(num1 + " / " +num2 +" = " +result);
                break;

            default :
                System.out.println("Invalid operator!");
                break;
        }
    }
}
