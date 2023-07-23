import java.util.*;
public class Main
{
	public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
    System.out.print("Enter the value of row");
      int n=sc.nextInt();
      System.out.print("Enter the value of Column");
      int m=sc.nextInt();
      int grid[][]=new int[m][n];
      System.out.print("Enter the value of matrix");
      for(int i=0;i<m;i++)
      {
          for(int j=0;j<n;j++)
          {
              grid[i][j]=sc.nextInt();
          }
      }
      int dp[][]=new int[grid.length][grid[0].length];
      int k=dp.length;
      int l=dp[0].length;
     for(int i=k-1;i>=0;i--)
     {
         for(int j=l-1;j>=0;j--)
         {
             if(i==k-1 && j==l-1)
             {
                 dp[i][j]=grid[i][j];
             }else if(i==k-1)
             {
                 dp[i][j]=dp[i][j+1]+grid[i][j];
             }else if(j==l-1)
             {
                 dp[i][j]=dp[i+1][j]+grid[i][j];
             }else{
                 dp[i][j]=Math.min(dp[i+1][j],dp[i][j+1])+grid[i][j];
             }
         }
     }  
      System.out.println("Your Minimum path is :"+dp[0][0]);
    }
}
