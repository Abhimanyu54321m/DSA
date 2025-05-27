package company.Java;
import java.util.*;
public class Strings_problem {
    public static boolean isPalindrome(String str){
        for(int i=0; i<str.length()/2; i++){
            if(str.charAt(i) == str.charAt(str.length()-1-i)){
                return true;
            }
        }
        return false;
    }

    // shortest path

    public static float getShortestPath(String path) {
        int x = 0, y = 0;

        for(int i=0; i<path.length(); i++){
            char dir = path.charAt(i);
            // south
           if(dir == 'S'){
               y--;
           }else if(dir == 'N'){
               y++;
           }else if(dir == 'W'){
               x--;
           }else{
               x++;
           }
        }
        int X2 = x*x;
        int Y2 = y*y;
        return (float)Math.sqrt(X2 + Y2);
    }

    // find substring

    public static String substring(String str, int si, int ei){
        String substr = "";
        for(int i=si; i<ei; i++){
            substr+= str.charAt(i);
        }
        return substr;
    }

    // print largest string
     public static String largestString(String str[]){
        String largest = str[0];
        for(int i=0; i<str.length; i++){
          if(largest.compareTo(str[i]) < 0){
              largest = str[i];
          }
        }
        return largest;
     }

     // Compression string
    public static String compress(String str) {
           String newStr = "";
           //aaabc
          for(int i=0; i<str.length(); i++){
              Integer count = 1;
              while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)) {
                  count++;
                  i++;
              }
              newStr += str.charAt(i);
              if(count > 1){
                  newStr += count.toString();
              }
          }
          return newStr;
    }
    public static void main(String[] args) {
        ///String str[] = {"apple", "mango", "banana"};
        String str = "racecar";
//        //String path = "WNEENESENNN";
        System.out.println(isPalindrome(str));
//        //System.out.println(getShortestPath(path));
//       // System.out.println(substring(str, 0, 5));
//        //System.out.println(largestString(str));
//        String str = "aaabbccc";
//        System.out.println(compress(str));
    }
}
