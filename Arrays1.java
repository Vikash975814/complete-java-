import java.util.*;
public class ArrayOperation{
    public static void  Traversal(int a[],int size){
        for(int i=0;i<size;i++){
            System.out.println("Traversal element is: "+a[i]);
        }
    }
    public static void main(String s[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of an array");
        int size=sc.nextInt();
        int a[]=new int[5];
        System.out.println("enter the element of an array");
        for(int i=0;i<size;i++){
            a[i]=sc.nextInt();
        }
        Traversal(a,size);
    }
}
