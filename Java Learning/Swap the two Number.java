import java.util.*;
public class Main
{
    public static void Swap(int a,int b)
    {
       int temp=a;
       a=b;
       b=temp;
       System.out.println("first Number  is ="+a);
       System.out.println("Second Number is ="+b);
    }
	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the value of first Number");
     int n=sc.nextInt();
         System.out.print("Enter the value of Second Number");
     int m= sc.nextInt();
       Swap(n,m);
}
}
