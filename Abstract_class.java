package company.Java;
import java.util.*;
public class Abstract_class {
    public static void main(String[] args) {
      Horse h = new Horse();
      h.eat();
      h.walk();
        //System.out.println(h.color);
      Chicken c = new Chicken();
      c.eat();
      c.walk();
    }
}

abstract class animals {
    String color;

    animals(){
        color = "brown";
    }
    void eat() {
        System.out.println("animal eats");
    }

    abstract void walk();
}

class Horse extends animals {

    void changeColor(){
        color = "dark brown";
    }
    void walk(){
        System.out.println("walks on 4 legs");
    }
}

class Chicken extends animals {

    void changeColor(){
        color = "yellow";
    }
    void walk(){
        System.out.println("walks on 2 legs");
    }
}