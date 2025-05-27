package company.Java;
import org.w3c.dom.ls.LSOutput;

import java.util.*;
public class bit_manipulation {
    // check odd and even
    public static void oddOrEven(int n){
        int bitMask = 1;
        if((n & bitMask) == 0){
            System.out.println("even number");
        }else {
            System.out.println("odd number");
        }
    }
    // get Ith bit
    public static int getIthBit(int n, int i){
        int bitMask = 1<<i;
        if((n & bitMask) == 0){
            return 0;
        }else {
            return 1;
        }
    }
    // set ith bit
    public static int setIthBit(int n, int i){
        int bitMask = 1<<i;
        return n | bitMask;
    }
    // clear ith bit
    public static int clearIthBit(int n, int i){
        int bitMask = ~(1<<i);
        return n & bitMask;
    }
    // update ith bit
    public static int updateIthBit(int n, int i, int newBit){
//          if(newBit == 0){
//              return clearIthBit(n, i);
//          }else {
//              return setIthBit(n, i);
//          }
        n = clearIthBit(n, i);
        int BitMask = newBit<<i;
        return n | BitMask;
    }
    public static int clearLastIthBit(int n, int i){
        int bitMask = (~0)<<i;
        return n & bitMask;
    }
    // clear bits in range
    public static int clearBitsinRange(int n, int i, int j){
        int a = ((~0)<<(j+1));
        int b = (1<<i)-1;
        int bitMask = a | b;
        return n & bitMask;
    }
    // check given number of power of 2 or not
    public static boolean isPowerOfTwo(int n){
        return (n &(n-1)) == 0;
    }
    // count set bits in a number
    public static int setBitsCount(int n){
        int count = 0;
        while(n > 0){
            if((n & 1) != 0){
                count++;
            }
            n = n>>1;
        }

        return count;
    }
    // Fast Exponentiation
    public static int fastExpo(int a, int n){
        int ans = 1;

        while(n > 0){
            if((n & 1) != 0){
                ans = ans * a;
            }
            a = a * a;
            n = n>>1;
        }
        return ans;
    }
    public static void main(String[] args) {
//        System.out.println((5 & 6));
//        System.out.println((5 | 6));
//        System.out.println((5 ^ 6));
//        System.out.println((~5));
//        System.out.println(5<<2);
//        System.out.println(6>>1);

        //oddOrEven(8);
        //System.out.println(getIthBit(10, 2));
        //System.out.println(setIthBit(10, 3));
        //System.out.println(clearIthBit(10,1));
        //System.out.println(updateIthBit(10,2,1));
        //System.out.println(clearLastIthBit(15, 2));
       // System.out.println(clearBitsinRange(10, 2, 4));
        //System.out.println(isPowerOfTwo(8));
        //System.out.println(setBitsCount(10));
        //System.out.println(fastExpo(5, 3));

        // swap two number using third variable
//        int x = 3, y = 4;
//        System.out.println("Before swap: x = " + x + " and y = " +y);
//        // swap using xor
//        x = x ^ y;
//        y = x ^ y;
//        x = x ^ y;
//        System.out.println("After swap: x = " +x +" and y = " +y);

        // add 1 to an integer using Bit Manipulation

          int x = 6;
        System.out.println(x+" + "+1+" is "+-~x);
        x = -4;
        System.out.println(x+" + "+1+" is "+-~x);
        x = 0;
        System.out.println(x+" + "+1+" is "+-~x);
    }
}
