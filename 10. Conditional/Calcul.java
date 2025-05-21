import java.util.Scanner;

public class Calcul {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the Value of A");
        int a = sc.nextInt();
        System.out.println("enter the Operator");
        char operator =sc.next().charAt(0);
        System.out.println("enter the Value of B");
        int b=sc.nextInt();

        switch (operator) {
            case '+': 
                System.out.println(a+b);
                break;
            case '-': 
                System.out.println(a-b);
                break;
            case '*': 
                System.out.println(a*b);
                break;
            case '/': 
                System.out.println(a/b);
                break;
            case '%': 
                System.out.println(a%b);
                break;
            default:
                System.out.println("Enter the Correct operator");
        }
        sc.close();
    }
}
