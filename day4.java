package company.Java;
import java.util.*;
public class day4 {
    public static void main(String[] args) {
//        int counter = 0;
//       while(counter <= 10){
//            System.out.println("hello print");
//              counter++;
//        }

        // print number 1 to 10

//        int counter = 1;
//
//        while(counter <= 10){
//            System.out.println(counter);
//            counter++;
//        }

        // print 1 to

//         int counter = 1;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number n");
//        int n = sc.nextInt();
//        while(counter <= n){
//            System.out.print(counter +" ");
//            counter++;
//        }

        // Print sum of first n natural number

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number n");
//        int n = sc.nextInt();
//        int sum = 0;
//        int i = 1;
//        while(i <= n){
//         sum+=i;
//         i++;
//        }
//        System.out.println( "sum is : " +sum);

        // For Loop

//        for(int i=0; i<=10; i++){
//            System.out.println("hello world");
//        }

        // Print square pattern

//        for(int i = 1; i<=4; i++){
//            System.out.println("****");
//        }

        // print reverse a number

//        int n = 10899;
//
//        while(n > 0){
//            int lastDigit = n % 10;
//            System.out.print(lastDigit +" ");
//            n = n/10;
//        }
//        System.out.println();

        // reverse the given number

//        int n = 10899;
//        int rev = 0;
//        while(n > 0){
//            int lastDigit = n % 10;
//            rev = (rev*10)+lastDigit;
//            n = n/10;
//        }
//        System.out.println(rev);

        // do while loop

//        int counter = 1;
//        do {
//            System.out.println("hello world");
//            counter++;
//        }while( counter <= 10);

        // break statement

//        for(int i =1; i<=5; i++){
//            if(i == 3){
//                break;
//            }
//            System.out.println(i);
//        }
//        System.out.println("i am out of the loop");

        // if number is divided by 10 then break the loop

//        Scanner sc  = new Scanner(System.in);
//
//        do{
//            System.out.println("enter the number : ");
//            int n = sc.nextInt();
//            if(n % 10 == 0){
//                break;
//            }
//            System.out.println(n);
//        }while(true);

        // continue keyword

//        for(int i = 1; i<= 5; i++){
//            if(i==3){
//                continue;
//            }
//            System.out.println(i);
//        }

//        Scanner sc  = new Scanner(System.in);
//
//        do{
//            System.out.println("enter the number : ");
//            int n = sc.nextInt();
//            if(n % 10 == 0){
//                continue;
//            }
//            System.out.println(n);
//        }while(true);

        // check if a number is prime or not

//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter the number :");
//        int n = sc.nextInt();
//
//        if(n == 2){
//            System.out.println("n is prime");
//        } else{
//            boolean isPrime = true;
//            for(int i=2; i<=n-1; i++){
//                if(n%i == 0){
//                    isPrime = false;
//                }
//            }
//
//            if(isPrime == true){
//                System.out.println("n is prime");
//            }else{
//                System.out.println("n is not prime");
//            }
        //   }
        // second way to solve problem

//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter the number :");
//        int n = sc.nextInt();
//
//        if(n == 2){
//            System.out.println("n is prime");
//        } else {
//            boolean isPrime = true;
//            for (int i = 2; i <= Math.sqrt(n); i++) {
//                if (n % i == 0) {
//                    isPrime = false;
//                }
//            }
//
//            if (isPrime == true) {
//                System.out.println("n is prime");
//            } else {
//                System.out.println("n is not prime");
//            }
//        }


        // Assignment problem

        // Question 1


//        Scanner sc = new Scanner(System.in);
//        int number;
//        int choice;
//        int evenSum = 0;
//        int oddSum = 0;
//        do {
//            System.out.print("Enter the number ");
//            number = sc.nextInt();
//            if (number % 2 == 0) {
//                evenSum += number;
//            } else {
//                oddSum += number;
//            }
//            System.out.print("Do you want to continue?Press1 for yes or 0 for no");
//
//            choice = sc.nextInt();
//
//        } while (choice == 1);
//
//        System.out.println("Sum of even numbers: " + evenSum);
//        System.out.println("Sum of odd numbers: " + oddSum);


            // Question 2

//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        int fact = 1;
//
//        for(int i =1; i<=n; i++){
//            fact*=i;
//        }
//        System.out.println("factorial is : " +fact);

        // Question 3

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        for(int i = 1; i<= 10; i++){
            System.out.println( +n +"X" +i +"=" +n*i);
        }
    }

}
