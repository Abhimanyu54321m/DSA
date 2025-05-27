package company.Java;
import java.util.*;
public class Recursion_practice {
    public static void Duplicate(int arr[], int key, int idx){
        if(idx == arr.length){
            return;
        }
        if(arr[idx]==key){
            System.out.print(idx +" ");
        }
        Duplicate(arr,key,idx+1);
    }
    // Question 2
    static String digits[] = {"zero","one","two","three","four","five","six","seven","eight","nine"};

    public static void printDigits(int number){
        if(number == 0){
            return;
        }

        int lastDigit = number%10;
        printDigits(number/10);
        System.out.print(digits[lastDigit]+" ");
    }
    //find the length of string
    public static int length(String str){
        if(str.length() == 0){
            return 0;
        }

        return length(str.substring(1)) + 1;
    }
    // tower of Hanoi
    public static void tower(int n, String src, String helper, String dest){
        if(n==1){
            System.out.println("transfer disk" +" " +n +" " +"from" +" " +src +" " +"to" +" " +dest);
            return;
        }
        tower(n-1,src,dest,helper);
        System.out.println("transfer disk" +" " +n +" " +"from" +" " +src +" " +"to" +" " +dest);
        tower(n-1,helper,src,dest);
    }
    public static void main(String[] args) {
        String str = "abcde";
        int arr[] = {3, 2, 4, 5, 6, 2, 7, 2, 2};
//        Duplicate(arr,2,0);
//        System.out.println();
        //printDigits(1234);
        //System.out.println(length(str));
        tower(3,"A","B","C");
    }
}
