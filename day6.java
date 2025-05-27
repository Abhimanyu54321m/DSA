package company.Java;
import java.util.*;
public class day6 {
//    public static void printHelloWorld(){
//        System.out.println("hello world");
//        System.out.println("hello world");
//    }
//    public static int calculateSum(int a, int b){ // parameter or formal parameter
//        int sum = a + b;
//        return sum;
//    }
//
//    public static void swap(int a, int b) {
//        int temp = a;
//        a = b;
//        b = temp;
//
//        System.out.println(a);
//        System.out.println(b);
//    }
//
//    public static int multiply(int a, int b) {
//        int product = a * b;
//        return product;
//    }
//
//    public static int Factorial(int n){
//        int fact = 1;
//        for(int i = 1; i<=n; i++){
//            fact*=i;
//        }
//        return fact;
//    }
//    public static int binomial(int n, int r){
//       int n_fact = Factorial(n);
//       int r_fact = Factorial(r);
//       int nmr_fact = Factorial(n-r);
//       int binomial1 =  (n_fact/(r_fact*nmr_fact));
//       return binomial1;
//    }
//    public static int sum(int a, int b) {
//        return a + b;
//    }
////    public static int sum(int a, int b, int c){
////        return a + b + c;
////    }
//    public static float sum(float a, float b){
//        return a + b;
//    }
//        public static boolean isPrime(int n) {
//            boolean isPrime = true;
//            for(int i = 2; i<=n-1; i++){
//                if(n%i == 0){
//                    isPrime = false;
//                    break;
//                }
//            }
//            return isPrime;
//        }

    // optimize version

    public static boolean isPrime(int n) {
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i == 0) {
                return false;
            }
        }
        return true;
    }
      // print range in the prime number
    public static void primesInRange(int n) {
        for(int i=2; i<=n; i++) {
            if(isPrime(i)) {
                System.out.print(i +" ");
            }
        }
        System.out.println();
    }

    public static void binToDec(int binNum) {
        int myNum = binNum;
        int pow = 0;
        int decNum = 0;

        while(binNum > 0) {
            int lastDigit = binNum % 10;
            decNum = decNum + (lastDigit * (int)Math.pow(2, pow));

            pow++;
            binNum = binNum/10;
        }

        System.out.println("decimal of " +myNum +" = " +decNum);
    }

    public static void DecToBin(int n) {
        int MyNum = n;
        int pow = 0;
        int bin = 0;

        while(n > 0) {
            int rem = n % 2;
            bin = bin + (rem * (int)Math.pow(10, pow));
            pow++;
            n = n/2;
        }
        System.out.println("Binary of " +MyNum +" = " +bin);
    }

    // Assignment problem

    // Question 1

    public static int AverageFind(int a, int b, int c) {
        int sum = a + b +c;
        int average = sum/3;
        return average;
    }

    // Question 2

    public static boolean isEven(int n) {
        int even = n;
        if(even % 2 == 0){
            return true;
        }
        return false;
    }

    // Question 3

    public static boolean Palindrome(int n) {
        int sum = 0;
        int MyNum = n;
        while(n > 0){
            int rem = n % 10;
            sum = (sum * 10) + rem;
            n = n/10;
        }
       boolean isPalindrome = false;
        if(sum == MyNum) {
            isPalindrome = true;
        }
        return isPalindrome;
    }

    // Question 5

    public static int SumOfDigit(int n) {
        int sum = 0;
        while(n > 0){
            int rem = n % 10;
            sum = sum + rem;
            n = n/10;
        }
        return sum;
    }
    public static void main(String[] args) {
//        printHelloWorld();
//        Scanner sc = new Scanner(System.in);
//        System.out.println("");
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int sum = calculateSum(a, b); // arguments or actual parameters
//        System.out.println("sum is : " +sum);

        // swap - values exchange
//        int a = 5;
//        int b = 10;
//        swap(a, b);
//        System.out.println(a);
//        System.out.println(b);
//        int prod = multiply(5, 8);
//        System.out.println(prod);
//        int facts = Factorial(5);
//        System.out.println(facts);
//        int bin = binomial(5,3);
//        System.out.println(bin);
//        System.out.println(sum(1,6));
//        System.out.println(sum(7.8f,9.3f));
       System.out.println(isPrime(70));
       primesInRange(20);
//        binToDec(101);
//        DecToBin(5);
//        System.out.println("Average = " +AverageFind(4,6,8));
//        System.out.println(isEven(90));
//        System.out.println(Palindrome(1121));
  //      System.out.println(SumOfDigit(76));
    }
}
