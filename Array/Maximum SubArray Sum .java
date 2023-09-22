import java.util.*;


public class Main
{
    public static void maxArray(int arr[])
    {
        int ms=0;
        int cs=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            cs=cs+arr[i];
            if(cs<0)
            {
                cs=0;
            }
            ms=Math.max(cs,ms);
        }
        System.out.println("Maximum SubArray sum="+ms);
    }
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the Size of array");
	    int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the array element");
		for(int i=0;i<n;i++)
		{
		    arr[i]=sc.nextInt();
		}
		maxArray(arr);
	}
}
