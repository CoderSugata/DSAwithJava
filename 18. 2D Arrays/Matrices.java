import java.util.Scanner;

public class Matrices {

  public static boolean searchKey(int matrix[][],int key){
      for(int i=0;i<matrix.length;i++){
          for(int j=0;j<matrix[0].length;j++){
              if(matrix[i][j]==key){
                System.out.print("Key found at "+i+","+j);
                return true;
              }
          }
        }
        System.out.println("couldn't found the key");
        return false;
  }

     public static void main(String[] args) {
        int matrix[][]=new int[3][3];
        int n=matrix.length, m=matrix[0].length;

        //input of 2D Array
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<n;i++){
          for(int j=0;j<m;j++){
               matrix[i][j]=sc.nextInt();
          }
        }
        sc.close();
          //Output of 2D Array

          for(int i=0;i<n;i++){
          for(int j=0;j<m;j++){
              System.out.print(matrix[i][j]+" ");
          }
          System.out.println();
        }

        searchKey(matrix, 5);
     }
}