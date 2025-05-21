//import java.util.Arrays;
//import java.util.Collections;

public class Sorts {
     
    public static void BubbleSort(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if (arr[j]>arr[j+1]) {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }

    public static void SelectionSort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int minPosition=i;
            for(int j=i+1;j<arr.length;j++){
                if (arr[minPosition]>arr[j]) {
                    minPosition=j;
                }
            }
            //swap
            int temp=arr[minPosition];
            arr[minPosition]=arr[i];
            arr[i]=temp;
        }
    }

    public static void InsertionSort(int arr[]){
        for(int i=1;i<arr.length;i++){
            int curr=arr[i];
            int prev=i-1;
            while (prev>=0 && arr[prev]>curr) {
                arr[prev+1]=arr[prev];
                prev--;
            }
            arr[prev+1]=curr;
        }
    }
  
    public static void CountSort(int arr[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            largest= Math.max(largest, arr[i]);
        }
        //creating a count array
        int count[]=new int[largest+1];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
        //sorting 
        int j=0;
        for(int i=0;i<count.length;i++){
            while(count[i]>0){
            arr[j]=i;
            j++;
            count[i]--;
            }
        }
    }

    public static void PrintArr(int arr[]){
        for(int k=0;k<arr.length;k++){
            System.out.print(arr[k]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={1,4,4,3,2,4,3,7};
        //BubbleSort(arr);
        //SelectionSort(arr);
        //InsertionSort(arr);
        //Arrays.sort(arr);
        CountSort(arr);
        PrintArr(arr);
    }
}
