import java.util.*;
public class Main
{
    public static int linearSearch(int arr[],int item)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==item)
            {
            return i;
            }
        }
        return -1;
    }
	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the  size of Array");
    int n=sc.nextInt();
    int arr[]=new int[n];
    System.out.println("Enter the Array Element");
    for(int i=0;i<n;i++)
    {
        arr[i]=sc.nextInt();
    }
      System.out.println("Enter The Key");
    int key=sc.nextInt();
    int index=linearSearch(arr,key);
    if(index==-1)
    {
        System.out.println("Key not found");
    }else{
        System.out.println("Key is found and position is = "+ index);
    }
}
}
