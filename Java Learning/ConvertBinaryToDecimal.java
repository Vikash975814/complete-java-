import java.util.*;
public class Main
{
    public static void ConvertBinaryToDecimal(int n)
    {
       int pow=0;
       int decnum=0;
       while(n>0)
       {
           int temp=n%10;
           decnum+=temp*(int)Math.pow(2,pow);
           n=n/10;
           pow++;
       }
       System.out.println("Decimal Number is Of Given Numebr is ="+ decnum);
    }
	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the value of first Number");
     int n=sc.nextInt();
     ConvertBinaryToDecimal(n);
}
}
