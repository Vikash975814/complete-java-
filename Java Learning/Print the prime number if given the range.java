import java.util.*;
public class Main
{
    public static boolean isPrime(int n)
    {
     if(n==2) {
        return true;
     }else if(n==0 || n==1){
         return false;
     }else{
     for(int i=2;i<=Math.sqrt(n);i++)
     {
         if(n%i==0)
         {
             return false;
         }
     }
	}
	return true;
    }
	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the value of N");
     int n=sc.nextInt();
     for(int i=0;i<=n;i++)
     {
         if(isPrime(i))
         {
             System.out.println(i+ "= is the prime Number");
         }
     }
}
}
