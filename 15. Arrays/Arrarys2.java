public class Arrarys2 {
    
    public static void Update(int marks[],int nonchangable){
        nonchangable=10;
        for(int i=0;i<marks.length;i++){
            marks[i] +=1;
        }
    }

    public static void main(String[] args) {
        int nonchangable=5;
        int marks[]={99,98,97};
        System.out.println(marks[0]+" "+marks[1]+" "+marks[2]);

        Update(marks,nonchangable); // nonchangable won't change here
        
        System.out.println(nonchangable);

        for(int i=0;i<marks.length;i++){
            System.out.print(marks[i]+" ");
        }
        System.out.println();
    }
}
