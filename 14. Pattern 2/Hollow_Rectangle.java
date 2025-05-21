public class Hollow_Rectangle {
    
    public static void Hollow(int rows,int cols){
        //outer loops
        for(int i=1;i<=rows;i++){
            //inner loops
            for(int j=1;j<=cols;j++){ // cell(i,j)
                if (i==1 || i==rows || j==1 || j==cols) {
                    System.out.print("* "); 
                }else{
                    System.out.print("  ") ;
                }
            }
            System.out.println();
        }
    }

    public static void InvertedPyramid(int n){
        for(int i= 1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
            System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void InvertedPyramidNumbers(int n){
        for(int line=1;line<=n;line++){
            for(int j=1;j<=n-line+1;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public static void floydTringle(int n){
        int counter=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(counter+" ");
                counter++;
            }
            System.out.println();
        }
    }

    public static void zeroOneTringle(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if ((i+j)%2==0) {
                    System.out.print("1 ");
                }else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }

public static void Butterfly(int n){
    for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        for(int j=1;j<=2*(n-i);j++){
            System.out.print(" ");
        }
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
    }

    for(int i=n;i>=0;i--){
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        for(int j=1;j<=2*(n-i);j++){
            System.out.print(" ");
        }
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
    }
}

public static void rhombus(int n){
    for(int i=1;i<=n;i++){
        for(int j=1;j<=n-i;j++){
            System.out.print(" ");
        }
        for(int j=1;j<=n;j++){
            System.out.print("* ");
        }
        System.out.println();
    }
}

public static void HollowRhoumbus(int n){
    for(int i=1;i<=n;i++){
        for(int j=1;j<=n-i;j++){
            System.out.print(" ");
        }
        for(int j=1;j<=n;j++){
            if (i==1 || i==n || j==1 || j==n) {
                System.out.print("* ");
            }else{
                System.out.print("  ");
            }
        }
        System.out.println();
    }
}

public static void dimond(int n){
    for(int i=1;i<=n;i++){
        for(int j=1;j<=n-i;j++){
            System.out.print("  ");
        }
        for(int k=1;k<=(2*i)-1;k++){
            System.out.print(" *");
        }
        System.out.println();
    }

    for(int i=n;i>=0;i--){
        for(int j=1;j<=n-i;j++){
            System.out.print("  ");
        }
        for(int k=1;k<=(2*i)-1;k++){
            System.out.print(" *");
        }
        System.out.println();
    }
}

    public static void main(String[] args) {
        //Hollow(4, 6);
        //InvertedPyramid(5);
        //InvertedPyramidNumbers(5);
        //floydTringle(5);
        //zeroOneTringle(5);
        //Butterfly(5);
        //rhombus(5);
        //HollowRhoumbus(5);
        dimond(5);
    }
}
