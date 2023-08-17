/* class Employee{
    float salary=40000;
}
class Programmer extends Employee{
    int bonus=10000;
    public static void main(String args[]){
        Programmer p=new Programmer();
        System.out.println("Programmer salary is:"+p.salary);
        System.out.println("Bonus of Programmer is:"+p.bonus);
    }
}
*/
// Employee is superclass(parent class) & Programmer is subclass(child class)

// (1) Single Inheritance
/*
class Animal{
    void eat(){
        System.out.println("eating");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("barking");
    }
}
class TestInheritance{
    public static void main(String args[]){
        Dog d=new Dog();
        d.bark();
        d.eat();
    }}
*/

// (2) Multi-level Inheritance
//Super class -> Student
/* class Student
{
    int reg_no;
    void getNo(int no)
    {
        reg_no=no;
    }
    void putNo()
    {
        System.out.println("registration number= "+reg_no);
    }
}
//sub class(Marks) inheriting from superclass(Student)
class Marks extends Student
{
    float marks;
    void getMarks(float m)
    {
        marks=m;
    }
    void putMarks()
    {
        System.out.println("marks= "+marks);
    }
}
//sub class(Sports) inheriting from Marks class
class Sports extends Marks
{
    float score;
    void getScore(float scr)
    {
        score=scr;
    }
    void putScore()
    {
        System.out.println("score= "+score);
    }
}
public class Inheritance {
    public static void main(String args[])
    {
        Sports ob=new Sports();
        ob.getNo(987);
        ob.putNo();
        ob.getMarks(78);
        ob.putMarks();
        ob.getScore(68.7f);
        ob.putScore();
    }
}
*/

// (3) Hierarchical Inheritance
/*
//parent class
class Student
{
    public void methodStudent()
    {
        System.out.println("The method of the class Student invoked.");
    }
}
// first child class of Student
class Science extends Student
{
    public void methodScience()
    {
        System.out.println("The method of the class Science invoked.");
    }
}
// second child class of Student
class Commerce extends Student
{
    public void methodCommerce()
    {
        System.out.println("The method of the class Commerce invoked.");
    }
}
// third child class of Student
class Arts extends Student
{
    public void methodArts()
    {
        System.out.println("The method of the class Arts invoked.");
    }
}
public class Inheritance
{
    public static void main(String args[])
    {
        Science sci = new Science();
        Commerce comm = new Commerce();
        Arts art = new Arts();
//all the sub classes can access the method of super class
        sci.methodStudent();
        comm.methodStudent();
        art.methodStudent();
    }
}
// All children classes are calling .methodStudent fn() of class Student
// One parent, Multiple Children
*/

// (4) Hybrid Inheritance
/*
class GrandFather
{
    public void show()
    {
        System.out.println("I am grandfather.");
    }
}
//inherits GrandFather properties
class Father extends GrandFather
{
    public void show()
    {
        System.out.println("I am father.");
    }
}
//inherits Father properties
class Son extends Father
{
    public void show()
    {
        System.out.println("I am son.");
    }
}
//inherits Father properties
public class Daughter extends Father
{
    public void show()
    {
        System.out.println("I am a daughter.");
    }
    public static void main(String args[])
    {
        Daughter obj = new Daughter();
        obj.show();
    }
}  
*/