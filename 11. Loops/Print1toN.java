import java.util.Scanner;

public class Print1toN {
    public static void main(String[] args) {
        int counter=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any number");
        int range=sc.nextInt();
        sc.close();
      
        if (range<0) {
            while (counter>=range) {
            System.out.print(counter);
            System.out.print(" ");
            counter--;
            }
        }
        else{
            while (counter<=range) {
            System.out.print(counter);
            System.out.print(" ");
            counter++;
         }
        }
    }
}
