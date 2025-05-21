//In a program, input 3 numbers: A,B and C.You have to output the average of these 3 numbers.


import java.util.Scanner;
public class Average {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value of 3 numbers");
        
        float a=sc.nextFloat();
        float b=sc.nextFloat();
        float c=sc.nextFloat();

        float average=(a+b+c)/3;

        System.out.println("Sum of 3 number is "+average);
        sc.close();
    }
}

