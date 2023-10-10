//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            String s;
            s = br.readLine();
            
            Solution obj = new Solution();
            String res = obj.LowerToUpper(s);
            
            System.out.println(res);
            
        }
    }
}

// } Driver Code Ends



class Solution {
    public static String LowerToUpper(String s) {
        int i=0,n=s.length();
        StringBuilder sb=new StringBuilder();
        while(i<n)
        {
            char ch=s.charAt(i);
            int count=0;
            while(i<n && s.charAt(i)==ch)
            {
                i++;
                count++;
            }
            if(count==1)
            {
                sb.append(ch);
            }else if(count==2){
                sb.append(Character.toUpperCase(ch));
            }else {
                int k=count;
                     while(k!=0)
                     {
                         if(k%2!=0)
                         {
                         sb.append(ch);
                         k=k-1;
                     }else{
                         sb.append(Character.toUpperCase(ch));
                         k=k-2;
                     }
                     }                     
                 }
            }
    return sb.toString();
}
}
        
