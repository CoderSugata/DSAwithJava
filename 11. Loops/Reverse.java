import java.util.Scanner;

/* 
public class Reverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int number=sc.nextInt();

        while(number>0){
            int lastDigit = number%10;
            System.out.print(lastDigit);
            number = number/10;
        }
        //System.out.println();
        sc.close();
    }
}
*/

public class Reverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int number=sc.nextInt();
        int rev=0;

        while(number>0){
            int lastDigit=number%10;
            rev=(rev*10)+lastDigit;
            number=number/10;
        }
        System.out.print(rev);
        sc.close();
    }
}

