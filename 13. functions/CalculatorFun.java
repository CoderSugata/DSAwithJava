import java.util.Scanner;

public class CalculatorFun {
    public static void CalculateSum(int sum1,int sum2){
        int sum=sum1+sum2;
        System.out.println("Addition is: "+sum);
    }

    public static void CalculateSubs(int subs1,int subs2){
        int subs=subs1-subs2;
        System.out.println("Substract is: "+subs);
    }

    public static void CalculateMul(int mul1,int mul2){
        int mul=mul1*mul2;
        System.out.println("Multiplication is: "+mul);
    }

    public static void CalculateDiv(int div1,int div2){
        int div=div1/div2;
        System.out.println("Division is: "+div);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of a & b");
        int a=sc.nextInt();
        int b=sc.nextInt();
        sc.close();
        CalculateSum(a,b);
        CalculateSubs(a,b);
        CalculateMul(a,b);
        CalculateDiv(a,b);
    }
}
