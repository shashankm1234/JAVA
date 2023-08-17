public class Functions {
    // Example1
    /*static void myMethod() {
        System.out.println("I just got executed!");
      }
      public static void main(String[] args) {
        myMethod();
      } 
      */
      
    // Example 2
    /* static void myMethod() {
        System.out.println("I just got executed!");
      }
    
      public static void main(String[] args) {
        myMethod();
        myMethod();
        myMethod();
      }
      */

    // Parameters & Arguments
    /* static void myMethod(String fname) {
        System.out.println(fname + " Mishra");
      }
    
      public static void main(String[] args) {
        myMethod("Shashank");
        myMethod("Shivam");
        myMethod("Gaurav");
      }
      */

    // Multiple Parameters
    /* static void myMethod(String fname, int age) {
        System.out.println(fname + " is " + age + " years old.");
      }
    
      public static void main(String[] args) {
        myMethod("Shashank", 22);
        myMethod("Shivam", 24);
        myMethod("Gaurav", 19);
      }
      */

    // Return Values
    /* static int myMethod(int x) {
        return 5 + x;
      }
    
      public static void main(String[] args) {
        System.out.println(myMethod(3));
        System.out.println(myMethod(30));
      }
      */

      /* static int myMethod(int x, int y) {
        return x + y;
      }
    
      public static void main(String[] args) {
        System.out.println(myMethod(5, 3));
      }
      */

      // Function/Method with if/else
      // Create a checkAge() method with an integer variable called age
  static void checkAge(int age) {
    // If age is less than 18, print "access denied"
    if (age < 18) {
      System.out.println("Access denied - You are not old enough!");
    // If age is greater than, or equal to, 18, print "access granted"
    } else {
      System.out.println("Access granted - You are old enough!");
    }
  }
  public static void main(String[] args) {
    checkAge(20); // Call the checkAge method and pass along an age of 20
  }
}
