public class BinaryStrings {
    
    public static void BinaStrn(int n, int lastPlace, String str){
        //base case
        if (n==0) {
            System.out.println(str);
            return;
        }

        //main case
        //sit 0 on chair n
        BinaStrn(n-1, 0, str+"0");
        if (lastPlace==0) {
            BinaStrn(n-1, 1, str+"1");
        }
    }
    public static void main(String[] args) {
        BinaStrn(3, 0, "");
    }
}
