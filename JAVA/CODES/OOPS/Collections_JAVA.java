// (1) ArrayList
// Example 1 (String type)
/*import java.util.*;
class Collections_JAVA{
    public static void main(String args[]){
        ArrayList<String> list=new ArrayList<String>();//Creating arraylist
        list.add("Ravi");//Adding object in arraylist
        list.add("Vijay");
        list.add("Neeraj");
        list.add("Ajay");
        //Traversing list through Iterator
        Iterator itr=list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
 */

// Example2 (for integer write <Integer>
/*import java.util.*;
class Collections_JAVA{
    public static void main(String args[]){
        ArrayList<Integer> list=new ArrayList<Integer>();//Creating arraylist
        list.add(1);//Adding object in arraylist
        list.add(2);
        list.add(3);
        list.add(4);
        //Traversing list through Iterator
        Iterator itr=list.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next() + " ");
        }
    }
}
 */


// (2) LinkedList
// Exapmle1 (for string write <String>
//import java.util.*;
//public class Collections_JAVA{
//    public static void main(String args[]){
//        LinkedList<String> al=new LinkedList<String>();
//        al.add("Ravi");
//        al.add("Vijay");
//        al.add("Neeraj");
//        al.add("Ajay");
//        Iterator<String> itr=al.iterator();
//        while(itr.hasNext()){
//            System.out.println(itr.next());
//        }
//    }
//}

// Example2 (for int write <Integer>)
/*import java.util.*;
public class Collections_JAVA{
    public static void main(String args[]){
        LinkedList<Integer> al=new LinkedList<Integer>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        Iterator<Integer> itr=al.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
 */

// (3) Vector
// Example1 (<String>)
/*import java.util.*;
public class Collections_JAVA{
    public static void main(String args[]){
        Vector<String> v=new Vector<String>();
        v.add("Ayush");
        v.add("Amit");
        v.add("Ashish");
        v.add("Garima");
        Iterator<String> itr=v.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next() + " ");
        }
    }
}
 */

//Example2 (<Integer>)
/*import java.util.*;
public class Collections_JAVA{
    public static void main(String args[]){
        Vector<Integer> v=new Vector<Integer>();
        v.add(1);
        v.add(2);
        v.add(3);
        v.add(4);
        Iterator<Integer> itr=v.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next() + " ");
        }
    }
}
 */

// (4) STACK
/*import java.util.*;
public class Collections_JAVA{
    public static void main(String args[]){
        Stack<String> stack = new Stack<String>();
        stack.push("Ayush");
        stack.push("Garvit");
        stack.push("Amit");
        stack.push("Ashish");
        stack.push("Garima");
        stack.pop();
        Iterator<String> itr=stack.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next() + " ");
        }
    }
}
 */

// (5) QUEUE (FIFO)
//Queue interface can be instantiated as:
//Queue<String> q1 = new PriorityQueue();
//Queue<String> q2 = new ArrayDeque();

// (6) PriorityQueue
/*import java.util.*;
public class Collections_JAVA{
    public static void main(String args[]){
        PriorityQueue<String> queue=new PriorityQueue<String>();
        queue.add("Amit Sharma");
        queue.add("Vijay Raj");
        queue.add("JaiShankar");
        queue.add("Raj");
        System.out.println("head:"+queue.element());
        System.out.println("head:"+queue.peek());
        System.out.println("iterating the queue elements:");
        Iterator itr=queue.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        queue.remove();
        queue.poll();
        System.out.println("after removing two elements:");
        Iterator<String> itr2=queue.iterator();
        while(itr2.hasNext()){
            System.out.println(itr2.next());
        }
    }
}
 */

// (7) Hashset
 import java.util.*;
public class Collections_JAVA{
public static void main(String args[]){
//Creating HashSet and adding elements
HashSet<String> set=new HashSet<String>();
set.add("Ravi");
set.add("Vijay");
set.add("Ravi");
set.add("Ajay");
//Traversing elements
Iterator<String> itr=set.iterator();
while(itr.hasNext()){
System.out.print(itr.next() + " ");
}
}
}



