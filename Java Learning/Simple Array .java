import java.util.*;
public class Main
{
	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the  size of Array");
    int n=sc.nextInt();
    int arr[]=new int[n];
    System.out.println("Enter the Array Element");
    for(int i=0;i<n;i++)
    {
        arr[i]=sc.nextInt();
    }
    for(int i=0;i<n;i++)
    {
     System.out.println("Array Element is =" + arr[i]);   
    }
    System.out.println("Arrays length is ="+ arr.length);
}
}
