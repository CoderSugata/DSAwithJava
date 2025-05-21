import java.util.Scanner;

public class Temparature {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your temparature");
        double temp=sc.nextDouble();
        if (temp>=98 && temp<=100) {
            System.out.println("you have Mild fever! Take Rest");
        } else if(temp>=101){
            System.out.println("you have High fever");
        }else{
            System.out.println("you are a free Bird!!! Just Fly");
        }
        sc.close();
    }
}
