package OOPS;
class Animal{
    void eat(){System.out.println("eating...");}
}
class Dog extends Animal{
    void bark(){System.out.println("barking...");}
}
class BabyDog extends Dog{
    void weep(){System.out.println("weeping...");}
}
class Cat extends Animal{
    void meow(){System.out.println("meowing...");}
}
public class Inheritance {
    public static void main(String args[]) {
        BabyDog d = new BabyDog();
        d.weep();
        d.bark();
        d.eat();
        Cat c=new Cat();
        c.meow();
        c.eat();
    }
    }
