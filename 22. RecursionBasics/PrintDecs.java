public class PrintDecs {
    
    public static void Decs(int n){
        if (n==1) {
            System.out.println(n);
            return;
        }
        System.out.print(n+" ");
        Decs(n-1);
    }

    public static void Incs(int n){
        if (n==1) {
            System.out.print(n+" ");
            return;
        }
        Incs(n-1);
        System.out.print(n+" ");
    }

    public static int fact(int n){
        if (n==0) {
            return 1;
        }
        int fn= n* fact(n-1);
        return fn;
    }    

    public static int Sum(int n){
        if (n==1) {
            return 1;
        }
        int result=n+Sum(n-1);
        return result;
    }

    public static int Fibonacchi(int n){
        if (n==0 || n==1) {
            return n;
        }
        int fn=Fibonacchi(n-1)+Fibonacchi(n-2);
        return fn;
    }

    public static boolean isSorted(int arr[],int i){

        if (i==arr.length-1) {
            return true;
        }
        if (arr[i]>arr[i+1]) {
            return false;
        }
        return isSorted(arr, i+1);
    }

    public static int firstOccor(int arr[],int key,int i){

        if (i==arr.length) {
            return -1;
        }
        if (arr[i]==key) {
            return i;
        }

        return firstOccor(arr, key, i+1);
    }

    public static int lastOccor(int arr[],int key,int i){
        if (i==arr.length) {
            return -1;
        }
        int isFound= lastOccor(arr, key, i+1);
        if (isFound == -1 && arr[i]==key ) {
            return i;
        }
        return isFound;
    }

    public static int power(int x,int n) {
        if (n==0) {
            return 1;
        }
        return x * power(x, n-1);
        
    }

     public static int optimizedPower(int x,int n) {
        if (n==0) {
            return 1;
        }
        // for even case(n= even)
        int halfpower = optimizedPower(x, n/2)*optimizedPower(x, n/2);

        // for odd case(n= odd)
        if (n%2 !=0) {
            halfpower= x * halfpower;
        }
        return halfpower;
        
    }
    public static void main(String[] args) {
        // int n=10;
        // System.out.println(Fibonacchi(n));
        // int arr[]= {2,8,6,9,8,5,4,3,6};
        // System.out.println(lastOccor(arr, 6, 0));
        System.out.println(optimizedPower(2, 3));
    }
}
