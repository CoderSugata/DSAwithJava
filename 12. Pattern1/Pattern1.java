import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the line number");
        int number = sc.nextInt();
        sc.close();
        for (int line = 1; line <= number; line++) {
            for (int star = 1; star <= line; star++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
