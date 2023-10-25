//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t > 0){
            int n = Integer.parseInt(br.readLine());
            String s = br.readLine();
            Solution ob = new Solution();
            System.out.println(ob.minLength(s, n));
            t--;
        }
    } 
} 
// } Driver Code Ends


//User function Template for Java

class Solution { 
    public int minLength(String s, int n) { 
    	// code here 
    	Stack<Character> st=new Stack<>();
    	for(int i=0;i<s.length();i++)
    	{
    	    char ch=s.charAt(i);
    	    if(st.isEmpty())
    	    {
    	        st.push(ch);
    	    }else if(st.peek()=='1' && ch=='2')
    	    {
    	        st.pop();
    	    }else if(st.peek()=='2' && ch=='1')
    	    {
    	        st.pop();
    	    }else if(st.peek()=='3' && ch=='4')
    	    {
    	        st.pop();
    	    }else if(st.peek()=='4' && ch=='3')
    	    {
    	        st.pop();
    	    }else if(st.peek()=='5' && ch=='6')
    	    {
    	        st.pop();
    	    }else if(st.peek()=='6' && ch=='5')
    	    {
    	        st.pop();
    	    }else if(st.peek()=='7' && ch=='8')
    	    {
    	        st.pop();
    	    }else if(st.peek()=='8' && ch=='7')
    	    {
    	        st.pop();
    	    }else if(st.peek()=='9' && ch=='0')
    	    {
    	        st.pop();
    	    }else if(st.peek()=='0' && ch=='9')
    	    {
    	        st.pop();
    	    }else{
    	        st.push(ch);
    	    }
    	}
    	return st.size();
    }
}
