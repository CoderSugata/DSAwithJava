import java.util.Scanner;

public class SumofN {
    public static void main(String[] args) {
        int sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("the the value of N");
        int n=sc.nextInt();
        sc.close();

        for(int i=1;i<=n;i++){
            sum += i;
        }
        System.out.println("The total sum is: "+sum);
    }
}
