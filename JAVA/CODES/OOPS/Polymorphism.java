// COMPILE-TIME POLYMORPHISM (METHOD OVERLOADING)
// Example1 (by Using Different types of Arguments)
/*
class Helper {

    // Method with 2 integer parameters
    static int multiply(int a, int b)
    {
        // Returns product of integer numbers
        return a * b;
    }

    // Method 2
    // With same name but with 2 double parameters
    static double multiply(double a, double b)
    {
        // Returns product of double numbers
        return a * b;
    }
}
// Main class
class GFG {
    // Main driver method
    public static void main(String[] args)
    {
        // Calling method by passing
        // input as in arguments
        System.out.println(Helper.multiply(2, 4));
        System.out.println(Helper.multiply(5.5, 6.3));
    }
}
 */

// Example2 (by Using Different numbers of Arguments)
/*
class Helper {
    static int Multiply(int a, int b)
    {
        return a * b;
    }
    static int Multiply(int a, int b, int c)
    {
        return a * b * c;
    }
}
// Main class
class GFG {
    public static void main(String[] args)
    {
        System.out.println(Helper.Multiply(2, 4));
        System.out.println(Helper.Multiply(2, 7, 3));
    }
}
*/

// RUN-TIME POLYMORPHISM (METHOD OVERRIDING)
// Example1
/*
class A{
    public int harry(){
        return 4;
    }
    public void method2(){
        System.out.println("I am method2 of class A");
    }
}
// B is inheriting A
class B extends A{
    // B is overriding method2() of class A
    // writing @Override is a good practice as if any error comes while overriding this annotation will inform us
    @Override
    public void method2(){
        System.out.println("I am method2 of class B");
    }
    public void method3(){
        System.out.println("I am method3 of class B");
    }
}
public class Polymorphism {
    public static void main(String[] args){
        A obj = new A();
        obj.method2();

        B obj2 = new B();
        obj2.method2();               // I am method2 of class B
    }
}
// When B was inheriting from class A,it was accessing method2 of A, but when B overrided method2 and made its own method2
// then object of B when calls method2, method2 of class B gets called instead of method2 of class A
*/

// Example2
class Color {
    void paint() {
        System.out.println("I'm Painting.");
    }
}
class RedPaint extends Color {
    void paint() {
        System.out.println("I'm Painting with Red color.");
    }
}
class BluePaint extends Color {
    void paint() {
        System.out.println("I'm Painting with Blue color.");
    }
}
public class Polymorphism {
    public static void main(String[] args) {
        Color c;
        c = new RedPaint();
        c.paint();
        c = new BluePaint();
        c.paint();
    }
}









