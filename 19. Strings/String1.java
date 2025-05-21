import java.util.Scanner;

public class String1 {

    public static void printLetters(String str){
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {

    char arr[]={'a','b','c','d'};
    String str="abcd";
    String str2=new String("xyz");

    System.out.println(arr[2]+" "+str+" "+str2);
    Scanner sc=new Scanner(System.in);
    String name;
    name=sc.nextLine();
    sc.close();
    
    System.out.println(name.length());
    System.out.println("the name is "+name);

    //concetenation

    String firstName= "sugata";
    String lastName= "Mondal";
    String fullName= firstName+" "+lastName;
    printLetters(fullName);
    
    String s1= "tony";
    String s2= "tony";
    String s3=new String("tony");

    if (s1==s2) {
        System.out.println("equal");
    }else{
        System.out.println("not equals");
    }

    if (s1.equals(s3)) {
        System.out.println("euqals");
    }else{
        System.out.println("not equals");
    }
    }
}
