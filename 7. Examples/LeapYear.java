import java.util.Scanner;

//method 1 

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter the year:: ");
        int year=sc.nextInt();
        if ((year%4==0 && year%100!=0) || year%400==0)  {
            System.out.println(year + " Leap year");
        } else {
            System.out.println(year + " Not Leap year");
        }
        sc.close();
    }
}


// method 2

// public class LeapYear {
//     public static void main(String[] args) {
//         Scanner sc= new Scanner(System.in);
//         boolean Leap= false;
//         System.out.print("enter the year:: ");
//         int year=sc.nextInt();
//         if ((year%4==0 && year%100!=0) || year%400==0){
//             Leap=true;
//         }
//         System.out.println(year + " is a Leap Year? " + Leap);
//         sc.close();
//     }
    
// }