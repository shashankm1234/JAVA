/* public class Constructors {
  int x;  // class attribute

  // class constructor for the Constructors class
  public Constructors() {
    x = 5;  // Set the initial value for the class attribute x
  }

  public static void main(String[] args) {
    Constructors myObj = new Constructors(); // Create an object of class Main (This will call the constructor)
    System.out.println(myObj.x); // Print the value of x
  }
}
*/

// Default Constructor: A constructor is called "Default Constructor" when it doesn't have any parameter.
/* public class Constructors{
Constructors(){
    System.out.println("Default Constructor is created");
}
public static void main(String args[]){
Constructors obj = new Constructors();
}
}
*/

// Parameterized Constructor: A constructor which has a specific number of parameters is called a parameterized constructor.
/* class Constructors{  
    int id;  
    String name;  
    //creating a parameterized constructor  
    Constructors(int i,String n){  
    id = i;  
    name = n;  
    }  
    //method to display the values  
    void display(){
        System.out.println(id+" "+name);
    }  
   
    public static void main(String args[]){  
    //creating objects and passing values  
    Constructors s1 = new Constructors(111,"Karan");  
    Constructors s2 = new Constructors(222,"Aryan");  
    //calling method to display the values of object  
    s1.display();  
    s2.display();  
   }  
} 
*/

// CONSTRUCTOR OVERLOADING
public class Constructors{
  String name;
  int age;
  int id;
  // Default Constructor
  Constructors(){
    System.out.println("Default Constructor Called!");
  }
  // Parameterized Constructor with 2 arguments
  Constructors(String n,int a){
    name = n;
    age = a;
  }
  // Parameterized Constructor with 3 arguments
  Constructors(String n,int a,int i){
    name = n;
    id = i;
    age = a;
  }
  void display(){System.out.println(id+" "+name+" "+age);}  
  public static void main(String[] args){
    // Constructors s1 = new Constructors(null, 0, 0);
    Constructors s2 = new Constructors("Karan",22);  
    Constructors s3 = new Constructors("Aryan",25,189);  
    s2.display();  
    s3.display();
  }
}