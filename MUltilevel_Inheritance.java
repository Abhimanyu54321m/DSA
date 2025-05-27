package company.Java;
import java.util.*;
public class MUltilevel_Inheritance {
    public static void main(String[] args) {
       Dog dobby = new Dog();
       dobby.eat();
       dobby.legs = 4;
        System.out.println(dobby.legs);
    }
}

class Animals {
    String color;
    void eat(){
        System.out.println("eats");
    }
    void breath(){
        System.out.println("breathes");
    }
}

class Mammals extends Animals {
    int legs;
}

class Dog extends Mammals{
    String breed;
}
