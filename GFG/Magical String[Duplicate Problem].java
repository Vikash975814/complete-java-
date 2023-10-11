//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String S = read.readLine();

            Solution ob = new Solution();
            System.out.println(ob.magicalString(S));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution{
    static String magicalString(String S){
        // code here
        StringBuilder s=new StringBuilder();
        for(int i=0;i<S.length();i++)
        {
            int a=219-S.charAt(i);
             s.append((char) a);
             a=0;
        }
        return s.toString();
    }
}
