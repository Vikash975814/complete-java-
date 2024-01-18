import java.util.*;
public class Main
{
	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the value of N");
     int n=sc.nextInt();
     boolean isPrime=true;
     if(n==2)
     {
         isPrime=true;
     }else{
     for(int i=2;i<=Math.sqrt(n);i++)
     {
         if(n%i==0)
         {
             isPrime=false;
         }
     }
	}
	if(isPrime==true)
	{
	    System.out.println("This Number is prime Number");
	}else{
	    System.out.println("This is not a prime Number");
	}
}
}
