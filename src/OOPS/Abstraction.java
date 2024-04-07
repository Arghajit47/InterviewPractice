package OOPS;

//Abstract Keyword
abstract class Animal{
    abstract void walk();
    Animal(){
        System.out.println("This is an Animal");
    }
}
class Horse extends Animal{
    Horse() {
        System.out.println("Creating a Horse");
    }
    public void walk() {
        System.out.println("Walks on 4 legs");
    }
}
class Chicken extends Animal{
    public void walk(){
        System.out.println("Walks on 2 legs");
    }
}


// Interface implementing
interface Computer{
    public void config();
}

class Desktop implements Computer{
    public void config(){
        System.out.println(" It has Monitor, CPU, Keyboard and Mouse");
    }
}

class Laptop implements Computer{
    public void config() {
        System.out.println(" It has all the things but in one portable mechanism style");
    }
}
public class Abstraction {
    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.walk();
        Chicken chicken = new Chicken();
        chicken.walk();

        Desktop d = new Desktop();
        d.config();
    }
}
