package company.Java;
import java.util.*;
public class Inheritance {
    public static void main(String[] args) {
       Fish shark = new Fish();
       shark.eat();
    }
}

class Animal {
    String color;
    void eat(){
        System.out.println("eats");
    }
    void breath(){
        System.out.println("breathes");
    }
}

// derived class
class Fish extends Animal {
    int fins;

    void swim(){
        System.out.println("swims in water");
    }
}