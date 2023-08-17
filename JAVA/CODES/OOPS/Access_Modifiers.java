// (1) Private access modifier is accessible only within the class.
/*class A{
    private int data=40;
    private void msg(){System.out.println("Hello java");}
}

public class Access_Modifiers{
    public static void main(String args[]){
        A obj=new A();
        // System.out.println(obj.data);//Compile Time Error
        // obj.msg();//Compile Time Error
    }
}
 */

// (2) Public access modifier is accessible everywhere. It has the widest scope among all other modifiers.
/*public class Access_Modifiers{
    public void msg(){
        System.out.println("Hello");
    }
}
//save by B.java


class A {
    public static void main(String args[]) {
        Access_Modifiers obj = new Access_Modifiers();
        obj.msg();
    }
}
 */

// (3) Protected
/*public class Access_Modifiers{
    protected void msg(){
        System.out.println("Hello");
    }
}
class B extends Access_Modifiers{
    public static void main(String args[]){
        B obj = new B();
        obj.msg();
    }
}
 */

//(4) Default
/*
class A{
    void msg(){
        System.out.println("Hello");
    }
}
//save by B.java
class B{
    public static void main(String args[]){
        A obj = new A();//Compile Time Error
        obj.msg();//Compile Time Error
    }
}
 */
