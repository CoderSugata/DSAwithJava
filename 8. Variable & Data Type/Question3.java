/*Question3: Enter cost of 3 items from the user(using float data type)
 -a pencil,a pen and an eraser. You have to output the total cost of the items back to the user as their bill.
 (Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem)*/

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the price of pencil, pen & eraser");
        float pencil=sc.nextFloat();
        float pen=sc.nextFloat();
        float eraser=sc.nextFloat();
        float cost=(pencil+pen+eraser);
        System.out.println("the total price of the 3 product is "+cost);
        float finalCost=cost+(0.18f*cost);
        //float finalCost= cost+((cost*18)/100);
        System.out.println("the total price of the 3 product with 18% GST "+finalCost);
        sc.close();
    }
}
