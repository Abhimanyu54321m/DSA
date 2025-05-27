package company.Java;
import java.util.*;
public class Encrypt {
    public static Character encrypt(String s1, String s2){
        int charSum1 = 0, charSum2 = 0;

        // Calculate the sum of ASCII values for characters in s1
        for (char c : s1.toCharArray()) {
            charSum1 += c;
        }

        // Calculate the sum of ASCII values for characters in s2
        for (char c : s2.toCharArray()) {
            charSum2 += c;
        }
        return (char) Math.abs(charSum1 - charSum2);
    }
    public static boolean isPrime(int n){
        if (n <= 1) {
            return false;
        }
        for(int i=2; i<n; i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static ArrayList<Integer> prime(int n){
        ArrayList<Integer> list = new ArrayList<>();
        if (n <= 1) {
            return list;
        }
        for(int i=2; i<n; i++){
            if(isPrime(i)){
              list.add(i);

            }
        }
        return list;
    }
    public static int compareVersiob(String version1, String version2){
        String version1Arr[] = version1.split("\\.");
        String version2Arr[] = version2.split("\\.");
        int n1 = version1Arr.length;
        int n2 = version2Arr.length;
        int p1 = 0;
        int p2 = 0;
        while(p1<n1 || p2<n2){
            int num1 = (p1<n1)?Integer.parseInt(version1Arr[p1]):0;
            int num2 = (p2<n2)?Integer.parseInt(version2Arr[p2]):0;

            if(num1 != num2){
                return (num1>num2)?1:-1;
            }
            p1++;
            p2++;
        }
        return 0;
    }
    public static void main(String[] args) {
//        String s1 = "abcdefgh";
//        String s2 = "abcdfgh";
        //char missingChar = encrypt(s1, s2);
        //System.out.println("The missing character is: " + missingChar);
        //int s = 97;
        //System.out.println((char)s);
        //System.out.println(isPrime(100));
       // System.out.println(prime(100));
//        String s1 = "123";
//        String s2 = "321";
//        int m = Integer.parseInt(s1);
//        int n = Integer.parseInt(s2);
//        System.out.println(m+n);
        //System.out.println(compareVersiob("1.01","1.001"));

       // System.out.println(prime(12));
        String s = "abcdefg";
        int k = 2;
        char ans[] = new char[s.length()];

        for(int i=0; i<s.length(); i++){
            ans[i] = s.charAt(i);
        }
        int start = 0;
        int end = k-1;
        while(start < end){
            char temp = ans[start];
            ans[start] = ans[end];
            ans[end] = temp;
            start++;
            end--;
        }


        String m = "";

        for(int i=0; i<ans.length; i++){
            m += Character.toString(ans[i]);
        }

       // System.out.println(m);

        String a = "my name is monu";

        String[] ha = a.split("\\a+");
        for(int i=0; i < ha.length; i++){
            System.out.print(ha[i] +" ");
        }
    }
}
