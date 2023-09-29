import java.util.*;
public class Main
{
    public static void set(int arr[],int i,ArrayList<Integer> ll)
    {
    if(i>=arr.length)
    {
        System.out.println(ll);
        return;
    }
      set(arr,i+1,(ArrayList<Integer>)ll.clone());
       ll.add(arr[i]);
      set(arr,i+1,ll);
    }
	public static void main(String[] args) {
	 int arr[]={1,2,3,4};
	 set(arr,0,new ArrayList<>());
	}
}
