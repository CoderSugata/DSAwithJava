import java.util.Scanner;

public class Factorial{

    public static void factorial(int number){
    
    int f=1;
    for(int i=1;i<=number;i++){
        f=f*i;
    }
    System.out.println(f);
}
    public static void main(String[] args) { 
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the value of N");
    int n=sc.nextInt();
    sc.close();
    factorial(n);
    }
}