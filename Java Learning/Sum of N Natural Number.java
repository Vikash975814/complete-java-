import java.util.*;
public class Main
{
	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the value of N");
    int n=sc.nextInt();
    int sum=0;
    for(int i=0;i<n;i++)
    {
        sum+=i;
    }
		System.out.println("The sum of total N natural  Number= "+sum);
	}
}
