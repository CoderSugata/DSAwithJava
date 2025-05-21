import java.util.*;
public class ArrayList1 {


    public static void swap(ArrayList<Integer> myList,int idx1,int idx2){
        int temp=myList.get(1);
        myList.set(idx1, myList.get(idx2));
        myList.set(idx2,temp);
    }
    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> mainList =new ArrayList<>();
        ArrayList<Integer> list= new ArrayList<>();
        list.add(1); list.add(2);
        mainList.add(list);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(3); list2.add(4);
        mainList.add(list2);

        for(int i=0;i<mainList.size();i++){
            ArrayList<Integer> currList=mainList.get(i);
            for(int j=0;j<currList.size();j++){
                System.out.print(currList.get(j)+ " ");
            }
            System.out.println();
        }
        System.out.println(mainList);
     /* ArrayList<Integer> myList = new ArrayList<>();

        //add Elements  O(n)
        myList.add(10);
        myList.add(5);
        myList.add(9);
        myList.add(6);

        System.out.println(myList);

      //get Elements O(1)
        System.out.println(myList.get(1));

        //remove elements   O(n)
        myList.remove(2);
        System.out.println(myList);

        //set element at index O(n)
        myList.set(2, 50);
        System.out.println(myList);

        //check contain element  O(n)
        System.out.println(myList.contains(2));
        System.out.println(myList.contains(51));

        //checking the size of ArrayList
        System.out.println(myList.size());

        //print the ArrayList
        for(int i=0;i<myList.size();i++){
            System.out.print(myList.get(i)+" ");
        }
        System.out.println();

        //reverse of an arraylist  O(n)
        for(int i=myList.size()-1;i>=0;i--){
            System.out.print(myList.get(i)+" ");
        }
        System.out.println();

        //find the maximum value 
        int max=Integer.MIN_VALUE;
        for(int i=0;i<myList.size();i++){
                max=Math.max(max, myList.get(i));
        }
        System.out.println("maximum value is "+ max);  
        int idx1=1,idx2=3;
        swap(myList, idx1, idx2);
        System.out.println(myList);  

        // sorting am ArrayList
        Collections.sort(myList);
        System.out.println(myList);

        Collections.sort(myList, Collections.reverseOrder());
        System.out.println(myList);    */


    }
}
