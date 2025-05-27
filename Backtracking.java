package company.Java;

public class Backtracking {
    // find subset in string
    public static void FindSubset(String str, int i, String ans){
        if(i == str.length()) {
            if(ans.length() == 0){
                System.out.println("null");
            }else{
                System.out.println(ans);
            }
            return;
        }
        FindSubset(str, i+1, ans+str.charAt(i));
        FindSubset(str,i+1,ans);
    }
    // find permutation in given string
    public static void FindPermutation(String str, String ans){
        if(str.length() == 0){
            System.out.println(ans);
            return;
        }
        for(int i=0; i<str.length(); i++){
            char curr = str.charAt(i);
            String NewStr = str.substring(0,i) + str.substring(i+1);
            FindPermutation(NewStr,ans+curr);
        }
    }
    public static void main(String[] args) {
        String str = "abc";
        //FindSubset(str,0,"");
        FindPermutation(str,"");
    }
}
