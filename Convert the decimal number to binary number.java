import java .util.*;
public class Main
{
    public static void decimal(int n)
    {
        int myNum=0,power=0,binNum=0;
        while(n>0)
        {
            int rem=n%2;
            System.out.println("rem="+rem);
            binNum=binNum+(rem*(int)Math.pow(10,power));
            System.out.println("binNum="+binNum);
            power++;
            n=n/2;
            System.out.println("power="+power);
            System.out.println("n="+n);
        }
        System.out.println("Binary form of your Number is="+binNum);
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Decimal Number");
		int n=sc.nextInt();
		decimal(n);
	}
}
