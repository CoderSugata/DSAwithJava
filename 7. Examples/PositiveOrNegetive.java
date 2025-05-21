import java.util.Scanner;

public class PositiveOrNegetive {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number:: ");
        int number=sc.nextInt();
        if (number>=0) {
            System.out.println(number+ " is a positive number");
        } else {
            System.out.println(number+ " is a negetive number");
        }
        sc.close();
    }
}
