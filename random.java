package company.Java;
import java.util.*;
public class random {
    public static boolean isPrime(int n){
        boolean isprime = true;
        for(int i=2; i<=n-1; i++){
            if(n%i==0){
                isprime = false;
            }
        }
        return isprime;
    }
    public static void main(String[] args) {
//        Random r1 = new Random();
//        System.out.println(r1.nextInt(1,25));
        int n = 10;
    }
}
