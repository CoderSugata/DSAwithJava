public class LargestinArray {
    
    public static int LarinArr(int numbers[]){
        int largest=Integer.MIN_VALUE; // -infinity
        int smallest=Integer.MAX_VALUE; // +infinity
        for(int i=0;i<numbers.length;i++){
            if (largest<numbers[i]) {
                largest=numbers[i];
            }
            if (smallest>numbers[i]) {
                smallest=numbers[i];
            }
        }
        System.out.println("smallest number is: "+smallest);
        System.out.println("largest number is: "+largest);
        return largest;
    }

    public static void main(String[] args) {
        int numbers[]={1,2,3,6,-80,6,8,4};
        LarinArr(numbers);
        //System.out.println("largest number is: "+LarinArr(numbers));
    }
}
