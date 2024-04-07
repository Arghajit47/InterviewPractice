package OOPS;

class JavaBasic {
    String name;
    int age;

    public void getInfo(){
        System.out.println(this.name + " : " + this.age);
    }
}

public class Basic {
    public static void main(String[] args) {
        JavaBasic java = new JavaBasic();
        java.name = "Arghajit";
        java.age = 25;
        java.getInfo();

        JavaBasic basic = new JavaBasic();
        basic.name = "Singha";
        basic.age = 24;
        basic.getInfo();
    }
}
