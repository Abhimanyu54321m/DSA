package company.Java;

public class pattern_problem {
    public static void main(String[] args) {
        int n = 4;
//        4444333322221111
//        444333222111
//        44332211
//        4321
        for(int i=n; i>0; i--){
            for(int j=n; j>0; j--) {
                for(int k=i; k>=1; k--){
                    System.out.print(j);
                }
            }
            System.out.println();
        }
    }
}
