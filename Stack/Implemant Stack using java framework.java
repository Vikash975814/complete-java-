import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		Stack <Integer> s=new Stack<>();
		System.out.println("Enter the value of N");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
		    s.push(i);
		}
		while(!s.isEmpty()){
		    System.out.println(s.peek());
		    s.pop();
		}
	}
}
