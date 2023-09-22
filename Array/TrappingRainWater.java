import java.util.*;
public class Main
{
    public static void trappingWater(int arr[])
    {
        int leftmax[]=new int[arr.length];
        leftmax[0]=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            leftmax[i]=Math.max(arr[i],leftmax[i-1]);
        }
          int  rightmax[]=new int[arr.length];
        leftmax[arr.length-1]=arr[arr.length-1];
        for(int i=arr.length-2;i>=0;i--)
        {
            rightmax[i]=Math.max(arr[i],rightmax[i+1]);
        }
        int waterlevel=0;
        for(int i=0;i<arr.length;i++)
        {
            int trapped=Math.min(leftmax[i],rightmax[i]);
            waterlevel+=trapped-arr[i];
        }
        System.out.println("Maximum trapped="+waterlevel);
    }
    public static void main(String s[])
    {
        int arr[]={4,2,0,6,3,2,5};
        trappingWater(arr);
    }
}
        
