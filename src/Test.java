import java.io.*;
public class Test {
    public static void main(String[]args){
        show(new Cat());
        show(new Dog());
        Animal a=new Cat();
        a.eat();
        Cat c=(Cat)a;
        c.work();

    }
    public static void show(Animal a){
        a.eat();
        if(a instanceof Cat){
            Cat c=(Cat) a;
            c.work();
        }else if(a instanceof Dog){
            Dog d=(Dog)a;
            d.work();
        }
    }
}
abstract class Animal{
    abstract void eat();
}
class Cat extends Animal{
    public void eat(){
        System.out.println("fish eating");
    }
    public void work(){
        System.out.println("mouse catching");
    }
}
class Dog extends Animal{
    public void eat(){
        System.out.println("meat eating");
    }
    public void work(){
        System.out.println("house watching");
    }
}