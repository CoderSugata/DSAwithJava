//In a program, input the side of a square. You have to output the area of the square.
import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of a side of Squre");
        int side=sc.nextInt();
        int area=side*side;
        System.out.println("area of the square is :"+area);
        sc.close();
    }  
}