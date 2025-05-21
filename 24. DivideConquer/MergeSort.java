public class MergeSort {

    //print the array
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    //recursive Merge Sort

    public static void MergeSorting(int arr[],int si,int ei){
        //base case
        if (si>=ei) {
            return;
        }
        //main case
        
        //finding the MID
        int mid= si+(ei-si)/2;
        MergeSorting(arr, si, mid); //left side
        MergeSorting(arr, mid+1, ei); //right side
        Merge(arr, si, mid, ei);
    }

    //merge sort

    public static void Merge(int arr[],int si, int mid, int ei){

        //create a temporary array
        int temp[]=new int[ei-si+1];

        int i=si; // iterator for left part
        int j=mid+1; // iterator for right part
        int k=0; //iterator for temp array

        while (i<=mid && j<=ei) {
            if (arr[i]<arr[j]) {
                temp[k]=arr[i];
                i++;
            }else{
                temp[k]=arr[j];
                j++;
            }
            k++;
        }

        //left part
        while (i<=mid) {
            temp[k++]=arr[i++];
        }

        //right part
        while (j<=ei) {
            temp[k++]=arr[j++];
        }

        //copy temp array to original array
        for(k=0,i=si;k<temp.length;k++,i++){
            arr[i]=temp[k];
        }
    }
    

    public static void main(String[] args) {
        int arr[]={6,3,9,5,2,8, -54};
        MergeSorting(arr, 0, arr.length-1);
        printArr(arr);
    }
}
