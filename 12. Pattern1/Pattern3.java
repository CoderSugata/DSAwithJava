//half-pyramid
import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args) {
        HalfPyramid();
    }

public static void HalfPyramid(){
    Scanner sc=new Scanner(System.in);
    System.out.print("enter the line number");
    int number=sc.nextInt();
    sc.close();
        for(int line=1;line<=number;line++){
            for(int star=1;star<=line;star++){
                System.out.print(star+ " ");
            }
            System.out.println();
        }
    }
}