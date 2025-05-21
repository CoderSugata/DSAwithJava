public class ConstructorExample {

    @SuppressWarnings("unused")
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Sugata");
        Student s3 = new Student(125);
    }
}

class Student {
    String name;
    int roll;

    Student() {
        System.out.println("constructor is called");
    }

    Student(String name) {
        this.name = name;
        System.out.println(name);
    }

    Student(int roll) {
        this.roll = roll;
        System.out.println(roll);
    }
}
