import java.util.*;
public class AreaBasic{
    public static void main(String args[]){
        
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the Value of a");
        int a= sc.nextInt();
        System.out.println("enter the Value of b");
        int b= sc.nextInt();
        int product= a*b;
        System.out.println(product);
        sc.close();
    }
}