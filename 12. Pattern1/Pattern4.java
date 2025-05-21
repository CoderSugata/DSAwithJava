import java.util.Scanner;

public class Pattern4 {

    public static void characters(){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the value of line number");
        int number=sc.nextInt();
        sc.close();
        char ch='A';
        for(int line=1;line<=number;line++){
            for(int j=1;j<=line;j++){
                System.out.print(ch+ " ");
                ch++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        characters();
    }
}

