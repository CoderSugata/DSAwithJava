import java.util.Scanner;

public class PosOrNeg {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number you want to check");
        int number=sc.nextInt();
        if (number>=0) {
            System.out.println(number + " is a Positive number");
        } else {
            System.out.println(number + " is a Negetive number");
        }
        sc.close();
    }
}
