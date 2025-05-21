import java.util.Scanner;

//sum of 2 numbers
public class FuncOver {
    public static int sum(int a, int b){
        return a+b;
    }
//sum of 2 floating numbers
    public static float sum(float a, float b){
        return a+b;
    }
//sum of 3 numbers
    public static int sum(int a, int b,int c){
        return a+b+c;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of a,b & c");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        sc.close();
        System.out.println("sum of 2 numbers is: "+sum(a, b));
        System.out.println("sum of 2 floating numbers is: "+sum(a, b));
        System.out.println("sum of 3 numbers is: "+sum(a, b, c));
    }
}
