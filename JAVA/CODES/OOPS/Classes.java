/* public class Classes {
    // class must be named on file name
    // here x variable is inside class Classes, in main() object myObj is made
    // then using dot(.) , obj accesses x
    int x = 5;
  public static void main(String[] args) {
    Classes myObj = new Classes();
    System.out.println(myObj.x);
  }
}
*/

// MULTIPLE OBJECTS
/*public class Classes {
  int x = 5;

  public static void main(String[] args) {
    Classes myObj1 = new Classes();  // Object 1
    Classes myObj2 = new Classes();  // Object 2
    System.out.println(myObj1.x);
    System.out.println(myObj2.x);
  }
}
*/

// ATTRIBUTES IN CLASSES
// You can access attributes by creating an object of the class, and by using the dot syntax (.)
/* public class Classes {
  int x = 5;

  public static void main(String[] args) {
    Classes myObj = new Classes();
    System.out.println(myObj.x);
    // modifying attribute
    myObj.x = 40;
    System.out.println(myObj.x);
  }
}
*/

// If you don't want the ability to override existing values, declare the attribute as final:
/* public class Classes {
  final int x = 10;

  public static void main(String[] args) {
    Classes myObj = new Classes();
    myObj.x = 25; // will generate an error: cannot assign a value to a final variable
    System.out.println(myObj.x);
  }
}
*/

// STATIC VS PUBLIC
/* public class Classes {
  // Static method
  static void myStaticMethod() {
    System.out.println("Static methods can be called without creating objects");
  }

  // Public method
  public void myPublicMethod() {
    System.out.println("Public methods must be called by creating objects");
  }

  // Main method
  public static void main(String[] args) {
    myStaticMethod(); // Call the static method, we don't need to create an object of class to call it
    // myPublicMethod(); This would compile an error

    Classes myObj = new Classes(); // Create an object of Main
    myObj.myPublicMethod(); // Call the public method on the object
  }
}
*/

// Access Methods With an Object
public class Classes {
 
  // Create a fullThrottle() method
  public void fullThrottle() {
    System.out.println("The car is going as fast as it can!");
  }

  // Create a speed() method and add a parameter
  public void speed(int maxSpeed) {
    System.out.println("Max speed is: " + maxSpeed);
  }

  // Inside main, call the methods on the myCar object
  public static void main(String[] args) {
    Classes myCar = new Classes();   // Create a myCar object
    myCar.fullThrottle();      // Call the fullThrottle() method
    myCar.speed(200);          // Call the speed() method
  }
}
