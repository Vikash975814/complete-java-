import java.io.*;
import java.util.*;
public class Solution {
    public static void main(String[] args) {
         int c=0;
        Scanner sc = new Scanner(System.in);
        int  n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                int sum = 0;
                for(int k=i;k<=j;k++)
                {
                    sum+=a[k];
                   
                }
                if(sum<0)
                 c++;
            }
        }
        System.out.print(c);
    }
    
}
