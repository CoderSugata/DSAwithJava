public class Abstractclass {
    public static void main(String[] args) {
        Horse h=new Horse();
        h.eat();
        h.walk();

        Chicken ch=new Chicken();
        ch.eat();
        ch.walk();

        System.out.println(h.color);
        //System.out.println(ch.color);
    }
}

abstract class Animal {
    String color;
    void eat(){
        System.out.println("animal eats");
    }
    abstract void walk();
    Animal(){
        color="brown";
    }
}

class Horse extends Animal{
    void walk(){
        System.out.println("walks on 4 legs");
    }
    void changeColor(){
        color="dark brown";
    }
}
class Chicken extends Animal{
    void walk(){
        System.out.println("walks on 2 legs");
    }
    void changeColor(){
        color="yellow";
    }
}