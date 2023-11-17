//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 
class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0){
            String n = read.readLine().trim();
            Solution ob = new Solution();
            long ans = ob.findpos(n);
            System.out.println(ans);
        }
    } 
} 
// } Driver Code Ends


//User function Template for Java
class Solution 
{ 
    long findpos(String n) 
    { 
        // code here
     long p=0;
     for(int i=0;i<n.length();i++)
     {
         if(n.charAt(i)=='4')
         {
             p=p*2+1;
         }else{
             p=p*2+2;
         }
     }
     return p;
    }
}
