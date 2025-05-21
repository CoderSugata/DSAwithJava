import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the day of Week");
        int daysOfWeek=sc.nextInt();
        // if (daysOfWeek<1 && daysOfWeek>7) {
        //     System.out.println("Please, Enter a valid input betweek 1 to 7");
        //     return;
        //} 
    //     if (daysOfWeek ==1) {
    //         System.out.println("Sunday");
    //     } else if(daysOfWeek ==2) {
    //         System.out.println("Monday");
    //     }
    //     else if(daysOfWeek ==3) {
    //         System.out.println("Tuesday");
    //     }
    //     else if(daysOfWeek ==4) {
    //         System.out.println("Wednesday");
    //     }
    //     else if(daysOfWeek ==5) {
    //         System.out.println("Thursday");
    //     }
    //     else if(daysOfWeek ==6) {
    //         System.out.println("Friday");
    //     }
    //     else if(daysOfWeek ==7) {
    //         System.out.println("Saturday");
    //     }else{
    //         System.out.println("enter a valid input");
    //     }
    //     sc.close();
    // }

    switch(daysOfWeek){
        case 1: {
            System.out.println("Sunday");
            break;
        }
        case 2: {
            System.out.println("Monday");
            break;
        }
        case 3: {
            System.out.println("Tuesday");
            break;
        }
        case 4: {
            System.out.println("Wednesday");
            break;
        }
        case 5: {
            System.out.println("thursday");
            break;
        }
        case 6: {
            System.out.println("Friday");
            break;
        }
        case 7: {
            System.out.println("Saturday");
            break;
        }
        default: {
            System.out.println("enter a valid input");
        }
    }
    sc.close();
}
}

