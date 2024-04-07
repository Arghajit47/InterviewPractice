package OOPS;

// This thing called function overloading

class Student{
    String name;
    int age;
    int id;
    public void printInfo(String name){
        System.out.println(name);
    }
    public void printInfo(int age){
        System.out.println(age);
    }
    public void printInfo(String name, int age, int id){
        System.out.println(name);
        System.out.println(id);
        System.out.println(age);
    }
}

public class Polymorphism {


    public static void main(String[] args) {
        Student s1 = new Student();
        s1.printInfo("Arghajit", 25, 47);
    }
}
