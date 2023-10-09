import java .util.*;
public class Main
{
    public static void binary(int n)
    {
        int myNum=0,power=0,decNum=0;
        while(n>0)
        {
            int rem=n%10;
            decNum=decNum+(rem*(int)Math.pow(2,power));
            power++;
            n=n/10;
        }
        System.out.println("Decimal form of your Number is="+decNum);
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Binary Number");
		int n=sc.nextInt();
		binary(n);
	}
}
