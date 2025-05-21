import java.util.Scanner;

public class BinomialCo {

    public static int binomial(int n,int r){
    
        int fact_n=factorial(n);
        int fact_r=factorial(r);
        int fact_ncr=factorial(n-r);

        int binomial= fact_n/(fact_r*fact_ncr);
        System.out.println(binomial);
        return binomial;
    }

    public static int factorial(int number){
    
        int f=1;
        for(int i=1;i<=number;i++){
            f=f*i;
        }
        //System.out.println(f);
        return f;
    }
    
    public static void main(String[] args) { 
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the value of N and R");
    int n=sc.nextInt();
    int r=sc.nextInt();
    sc.close();
    binomial(n,r);   
}
}
