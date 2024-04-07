package OOPS;

class Shape{
    public void area() {
        System.out.println(" Displays area ");
    }
}

class Triangle extends Shape{
    public void area(int l, int h){
        System.out.println(1/2*l*h);
    }
}

class Circle extends Shape{
    public void area(int r){
        System.out.println(3.14*r*r);
    }
}
class EquilateralTriangle extends Triangle{
    public void area(int l, int h){
        System.out.println(0.5*l*h);
    }
}

public class Inherit {
    public static void main(String[] args) {
        EquilateralTriangle eq = new EquilateralTriangle();
        eq.area(12,6);

        Circle cr = new Circle();
        cr.area(5);
    }

}
