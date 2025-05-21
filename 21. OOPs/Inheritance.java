public class Inheritance {
    public static void main(String[] args) {
        Fish shark=new Fish();
        shark.eat();
        shark.breathe();

        Dog tommy=new Dog();
        tommy.eat();
        tommy.legs=4;
        System.out.println(tommy.legs);
    }
}

//base or parent class
class  Animal {

    String color;

    void eat(){
        System.out.println("Eats");
    }

    void breathe(){
        System.out.println("breathe");
    }
}

// derived class
class  Fish extends Animal {
    int fins;

    void swim(){
        System.out.println("swims in water");
    }
    
}

 class Mammals extends Animal {
    int legs;
    
}

class Dog extends Mammals{
    String breed;
}