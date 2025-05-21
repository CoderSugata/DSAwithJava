public class Question1 {
    public static void main(String[] args) {
       
        /* Assignment 1 */
        // int exp1 =(x*y/x);
        // int exp2=(x*(y/x)); 

        // System.out.println(exp1+ ",");
        // System.out.println(exp2);

        /* Assignment 2 */
        // if(x > y && y > z){
        //     System.out.println("Hello");
        // }
        // if(z>y && z<x){
        //     System.out.println("java");
        // }
        // if((y+200) < x && (y+150)<z){
        //     System.out.println("Hello Java");
        // }

            // int x,y,z;
            // x=y=z=2;
            // x +=y;  /*x=x+y i.e, 4 */
            // y -=z;  /*y=y-z i.e, 0 */
            // z /=(x+y); /* z=z/(x+y) z=2/4+0 z=2/4 z=1/2 i.e, z=0.5=0 */
            // System.out.println(x+" "+y+" "+z); /* x=4 y=0 z=0 */

            // int x=9,y=12;
            // int a=2,b=4,c=6;

            // int exp = 4/3 * (x + 34) + 9 * (a + b * c) + (3 + y * (2 + a)) / (a + b*y);
            // System.out.println(exp);

            int x=10, y=5;

            int exp1 =(y*(x/y+x/y));
            int exp2= (y*x/y+y*x/y);

            System.out.println(exp1);
            System.out.println(exp2);
    }
}
