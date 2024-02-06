package OOPS;

public class constructors {
    public static void main(String[] args) {
        Student s1 = new Student();
        // System.out.println(s1.name );
    }
}

class Student {
    String name;
    int roll;

    // Student(String name) { //parameterized constuctor
    // this.name = name;
    Student() { // not parameterized constructor
        System.out.println("Constructor is called");
    }
    // }
}