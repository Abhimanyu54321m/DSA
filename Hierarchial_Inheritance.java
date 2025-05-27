package company.Java;

public class Hierarchial_Inheritance {
    public static void main(String[] args) {
      Bird b1 = new Bird();
      b1.eat();
    }
}
class Animal1{
    String color;
    void eat(){
        System.out.println("eats");
    }
    void breath(){
        System.out.println("breathes");
    }
}

class Mammal extends Animal1 {
    void walk(){
        System.out.println("walks");
    }
}

class Fish1 extends Animal1 {
    void swim(){
        System.out.println("swim");
    }
}

class Bird extends Animal1 {
    void fly(){
        System.out.println("fly");
    }
}