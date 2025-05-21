import java.util.Scanner;

// public class Prime {
//    public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter the number you want to check");
//         int number=sc.nextInt();
//         boolean isPrime =true;
        
//         for(int i=2;i<=number-1;i++){ //squreroot
//             if(number%i==0){
//                 isPrime=false;
//             }
//         }
//         if (isPrime==true) {
//             System.out.println(number + " it is a prime number");
//         } else {
//             System.out.println(number+" it is Not a prime number");
//         }
//         sc.close();
//    }
// }

public class Prime{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number you want to check");
        int number=sc.nextInt();
        sc.close();

        if(number<1){
            System.out.println("Enter a number greater that 1");
        }
       else{
            boolean isPrime=true;
            for(int i=2;i<=Math.sqrt(number);i++){
            if(number%i==0){
                isPrime =false;
                break;
            }
         }if(isPrime==true){
            System.out.println(number+ " is a prime number");
        }else{
            System.out.println(number+ " is Not a prime number");
        }
        }      
    }   
}

/*  if a number is negetive then it should print the message "It is a negetive number & 
it should not print the message that it's a prime number or not*/