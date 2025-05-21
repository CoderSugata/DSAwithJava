import java.util.Scanner;

public class WeekNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number you want to check");
        int weekDays=sc.nextInt();

        switch (weekDays) {
            case 1:
                    System.out.println("You entered " +weekDays+ " & it's Sunday");
                break;
            case 2:
                    System.out.println("You entered " +weekDays+ " & it's Monday");
                break;
            case 3:
                    System.out.println("You entered " +weekDays+ " & it's Tuesday");
                break;
            case 4:
                    System.out.println("You entered " +weekDays+ " & it's Wednesday");
                break;
            case 5:
                    System.out.println("You entered " +weekDays+ " & it's Thursday");
                break;
            case 6:
                    System.out.println("You entered " +weekDays+ " & it's Friday");
                break;
            case 7:
                    System.out.println("You entered " +weekDays+ " & it's Saturday");
                break;
            default: 
                System.out.println("You entered " +weekDays+ " & it's an invalid number");
        }
        sc.close();
    }
}
