public class PairsArray {
    
    public static void PairArr(int numbers[]){
        for(int i=0;i<numbers.length;i++){
            int currentVal=numbers[i];
            for(int j=i+1;j<numbers.length;j++){
                System.out.print("("+currentVal+","+numbers[j]+")");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10,12,14,16};
        PairArr(numbers);
    }
}
