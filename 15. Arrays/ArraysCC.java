import java.util.Scanner;

public class ArraysCC {
    public static void main(String[] args) {
        int marks[]= new int[50];
        System.out.println("length of the arrary is: "+marks.length);
        System.out.println("enter the marks");
        Scanner sc=new Scanner(System.in);
        marks[0]=sc.nextInt();
        marks[1]=sc.nextInt();
        marks[2]=sc.nextInt();
        sc.close();

        System.out.println("physics: "+marks[0]+" chemistry: "+marks[1]+" Math: "+marks[2]);

        System.out.println("percentage of marks are: "+(marks[0]+marks[1]+marks[2])/3+"%");
    }
}
