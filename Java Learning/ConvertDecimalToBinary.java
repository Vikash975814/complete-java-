import java.util.*;
public class Main
{
    public static void ConvertDecimalToBinary(int n)
    {
       int pow=0;
       int binnum=0;
       while(n>0)
       {
           int temp=n%2;
           binnum+=temp*(int)Math.pow(10,pow);
           n=n/2;
           pow++;
       }
       System.out.println("Binary Number is Of Given Numebr is ="+ binnum);
    }
	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the value of first Number");
     int n=sc.nextInt();
     ConvertDecimalToBinary(n);
}
}
