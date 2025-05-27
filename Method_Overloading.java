package company.Java;

public class Method_Overloading {
    public static void main(String[] args) {
       calculator calc = new calculator();
//        System.out.println(calc.sum(1, 2));
//        System.out.println(calc.sum(1.4f,6.8f));
    }
}

class Calculator {
    int sum(int a, int b) {
        return a + b;
    }

    float sum(float a, float b){
        return a + b;
    }

    int sum(int a, int b, int c){
        return a + b + c;
    }
}
