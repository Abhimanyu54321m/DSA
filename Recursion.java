package company.Java;

public class Recursion {
    public static void printDec(int n){
        if(n == 1){
            System.out.println(n);
            return;
        }
        System.out.print(n+" ");
        printDec(n-1);
    }
    // print increasing order
    public static void printInc(int n){
        if(n == 1){
            System.out.print(n+" ");
            return;
        }
        printInc(n-1);
        System.out.print(n+" ");
    }
    // print factorial
    public static int fact(int n){
        if(n == 0){
            return 1;
        }
        //int fnm1 = fact(n-1);
        int fn = n * fact(n-1);
        return fn;
    }
    // sum of n natural number
    public static int sum(int n){
        if(n == 1){
            return 1;
        }
        int snm1 = sum(n-1);
        return n + snm1;
    }

    // find fibonacci number
    public static int fib(int n){
        if(n == 0 || n==1){
            return n;
        }
        int fnm1 = fib(n-1);
        int fnm2 = fib(n-2);
        int fnm = fnm1 + fnm2;
        return fnm;
    }
    public static boolean isSorted(int arr[], int i){
        if(i == arr.length-1){
            return true;
        }
        if(arr[i]> arr[i+1]){
            return false;
        }
        return isSorted(arr,i+1);
    }
    public static int FirstOccur(int arr[], int i, int key){
        if(i == arr.length){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }
        return FirstOccur(arr,i+1,key);
    }
    // find power
    public static int power(int x, int n){
        if(n == 0){
            return 1;
        }
        return x * power(x, n-1);
    }
    // calculate the power for optimize version
    public static int optimizedPower(int a, int n){
        if(n == 0){
            return 1;
        }
        int halfPower = optimizedPower(a, n/2);
        int halPowerSq = halfPower * halfPower;

        // n is odd
        if(n % 2 != 0){
            halPowerSq = a * halPowerSq;
        }
        return halPowerSq;
    }
    // Tiling problem
    public static int TilingProblem(int n){
        // base case
        if(n == 0 || n == 1){
            return 1;
        }
        // vertically
        int fnm1 = TilingProblem(n-1);

        // horizontally choice
        int fnm2 = TilingProblem(n-2);

        int totWays = fnm1 + fnm2;
        return totWays;
    }
    //remove duplicates
    public static void removeDuplicates(String str, int idx, StringBuilder newStr, boolean[] map){
        if(idx == str.length()){
            System.out.println(newStr);
            return;
        }

        // work
        char currChar = str.charAt(idx);
        if(map[currChar-'a'] == true){
            removeDuplicates(str,idx+1,newStr,map);
        }else{
            map[currChar-'a'] = true;
            removeDuplicates(str,idx+1,newStr.append(currChar),map);
        }
    }
    // friends pairing problem
    public static int friendsPairing(int n){
        if(n == 1 || n == 2){
            return n;
        }
        // single choice
        int fnm1 = friendsPairing(n-1);

        //pair
        int fnm2 = friendsPairing(n-2);
        int pairWays = (n-1) * fnm2;

        //totWays
        int totWays = fnm1 + pairWays;
        return totWays;
    }
    //Binary string problem
    public static void printBinStrings(int n, int lastPlace, String str){
        // base case
        if(n == 0){
            System.out.println(str);
            return;
        }

        //kaam
        printBinStrings(n-1,0,str+"0");
        if(lastPlace == 0) {
            printBinStrings(n - 1, 1, str + "1");
        }
    }
    public static int sum1(int arr[], int i){
       // n = arr.length;
        if(arr.length-1==i){
            return arr[i];
        }
        int sum2 = arr[i] + sum1(arr,i+1);
        return sum2;
    }

    public static void mean(int arr[], int s, int e){
        if(arr.length%2 != 0){
            if(s==e){
                System.out.println(arr[s]);
                return;
            }
        }else{
            if(s+1==e){
                System.out.println((arr[s]+arr[e]/2));
                return;
            }
        }
        mean(arr,s+1,e-1);
    }
    public static void reverse(String str, int i){
        if(i==0){
            System.out.println(str.charAt(i));
            return;
        }
        System.out.print(str.charAt(i) +" ");
        reverse(str,i-1);
    }
    public static int strlen(String str){
        if (str.equals(""))
            return 0;
        else
            return strlen(str.substring(1)) + 1;
    }
    public static int sum_of_digit(int n){
        if(n==0){
            return 0;
        }
        return n%10 + sum_of_digit(n/10);
    }
    public static void reverseDigit(int n){
        if(n<0){
            return;
        }
        reverseDigit(n/10);


    }
    public static int findMax(int arr[], int n){
        if(n == 1)
            return arr[0];
        return Math.max(arr[n-1],findMax(arr,n-1));
    }
    public static boolean isPalindrome(String str, int s, int e){
        if(s==e){
            return true;
        }
        if(str.charAt(s)!=str.charAt(e)){
            return false;
        }
        if(s < e){
           return isPalindrome(str,s+1,e-1);
        }
        return true;
    }

    public static void main(String[] args) {
      int arr[] = {1, 3, -3, 2, -5,8};
        int n = arr.length;
      String str = "racecar";
         //printDec(n);
        // printInc(n);
        //System.out.println(fact(n));
        //System.out.println(sum(n));
        //System.out.println(fib(n));
        //System.out.println(isSorted(arr,0));
        //System.out.println(FirstOccur(arr,0,2));
        //System.out.println(power(2,10));
        //System.out.println(optimizedPower(2,10));
        //System.out.println(TilingProblem(10));
        //removeDuplicates(str,0,new StringBuilder(""), new boolean[26]);
        //System.out.println(friendsPairing(3));
        //printBinStrings(3,0,"");
        //System.out.println(sum1(arr,0));
        //mean(arr,0,arr.length-1);
       // reverse(str,str.length()-1);
        //System.out.println(strlen(str));
        //System.out.println(sum_of_digit(54));
        //System.out.println(findMax(arr,n));
       // System.out.println(isPalindrome(str,0, str.length()-1));
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
