public class MethodOverRid {
    public static void main(String[] args) {
        Deer d=new Deer();
        d.eat();
        // Animal ani=new Animal();
        // ani.eat();
    }
}

class Animal{
    void eat(){
        System.out.println("eats anything");
    }
}

class Deer extends Animal   {
    void eat(){
        System.out.println("eat grass");
    }
    
}