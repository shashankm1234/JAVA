// Example 1
/*
class Person {

    private String name;
    private int age;

    // getter (to get name)
    public String getName() {
        return name;
    }

    // setter (to set name)
    public void setName(String name) {
        this.name = name;
    }

    // getter (to get age)
    public int getAge() {
        return age;
    }

    // setter (to set age)
    public void setAge(int age) {
        this.age = age;
    }
}

public class Encapsulation {
    public static void main(String[] args)
    {
        Person person = new Person();
        person.setName("John");
        person.setAge(30);
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
    }
}
 */

// Example 2
class Encapsulate{
    private String geekName;
    private int geekRoll;
    private int geekAge;

    // getter(to return geekAge)
    public int getAge() {
        return geekAge;
    }

    // getter(to return geekName)
    public String getName() {
        return geekName;
    }

    // getter(to return geekRoll)
    public int getRoll() {
        return geekRoll;
    }

    // setter(to set geekAge)
    public void setAge(int newAge) {
        geekAge = newAge;
    }

    // setter(to set geekName)
    public void setName(String newName)
    {
        geekName = newName;
    }

    // setter(to set geekRoll)
    public void setRoll(int newRoll) {
        geekRoll = newRoll;
    }
}

public class Encapsulation {
    public static void main(String[] args)
    {
        Encapsulate obj = new Encapsulate();

        // setting values of the variables
        obj.setName("Harsh");
        obj.setAge(19);
        obj.setRoll(51);

        // Displaying values of the variables
        System.out.println("Geek's name: " + obj.getName());
        System.out.println("Geek's age: " + obj.getAge());
        System.out.println("Geek's roll: " + obj.getRoll());
    }
}