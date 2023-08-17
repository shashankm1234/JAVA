// Bike is an abstract class , in it run() is an abstract method(function)
// Example1
/*
abstract class Bike{
    abstract void run();
}
class Honda4 extends Bike{
    void run(){
        System.out.println("running safely");
    }
    public static void main(String args[]){
        Bike obj = new Honda4();
        obj.run();
    }
}
*/

// Example 2
/*
abstract class Bank{
    abstract int getRateOfInterest();
}
class SBI extends Bank{
    int getRateOfInterest(){
        return 7;
    }
}
class PNB extends Bank{
    int getRateOfInterest(){
        return 8;
    }
}
class TestBank{
    public static void main(String args[]){
        Bank b = new SBI();     //if object is PNB, method of PNB will be invoked
        int interest = b.getRateOfInterest();
        System.out.println("Rate of Interest is: "+interest+"%");
    }}
*/

// More Examples (Harry)

abstract class Parent{
    // default constructor
    public Parent(){
        System.out.println("Constructor of Parent");
    }
    public void sayHello(){
        System.out.println("Hello");
    }

    // Parent is an abstract class having abstract method greet(), now Parent will tell its derived(child) classes
    // children can use this greet() method to say good morning or good evening etc.
    abstract public void greet();
}
// class Child has overrided abstract class Parent's abstract method, so no need to
// make Child class abstract (either make class as abstract or override the method of parent class)
class Child extends Parent{
    // Override
    public void greet(){
        System.out.println("GOOD MORNING");
    }
}
// here if we dont make Child2 class as abstract it is wrong, it says either override the method greet() of Parent
// OR make this Child2 class as abstract
abstract class Child2 extends Parent{
    public void th(){
        System.out.println("I am good");
    }
}
public class Abstraction{
    public static void main(String[] args){
//        Parent p = new Parent();   // error this cant be done, this can b only done if we implement abstract method in class Parent
        Child c = new Child();         // possible as Child is a concrete class inheriting abstract class Parent
//        Child2 c2 = new Child();        // error as Child2 is also an abstract class

    }
}












