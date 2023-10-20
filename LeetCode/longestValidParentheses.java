class Solution {
    public int longestValidParentheses(String s) {
        int max=0;
        Stack<Character> st=new Stack<>();
        Stack<Integer>  index=new Stack<>();
          index.push(-1);
         for(int i=0;i<s.length();i++)
         {
             char ch=s.charAt(i);
             if(ch=='(')
             {
                 st.push(ch);
                 index.push(i);
             }else
             {
                 if(!st.isEmpty() && st.peek()=='(')
                 {
                     st.pop();
                     index.pop();
                     max=Math.max(max,i-index.peek());
                 }else{
                     index.push(i);
                 }
             }
         }
         return max;    
    }
}
