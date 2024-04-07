package OOPS;

class Pen {
    String company;
    int price;
    public void printInfo(){
        System.out.println(this.company + "'s pen costs " + this.price + "/-");
    }

    Pen(){
        System.out.println("This is a non parameterized constructor");
    }
}

class Company{
    String name;
    int salary;
    public void printInfo(){
        System.out.println(this.name + " : " + this.salary);
    }

    Company(String name, int salary){
        System.out.println("This is a parameterized constructor");
        this.name = name;
        this.salary = salary;
    }

}

public class Construct {
    public static void main(String[] args) {
        Pen pen1 = new Pen();
        pen1.company = "Cello";
        pen1.price = 15;

        pen1.printInfo();

        Company company = new Company("IBM", 8);
        company.printInfo();
    }

}
