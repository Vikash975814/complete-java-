class Solution {
    public String reverseVowels(String s) {
        char [] ch=s.toCharArray();
        Stack<Character> st=new Stack();
        for(int i=0;i<ch.length;i++)
        {
            if(converted(ch[i])){
                st.push(ch[i]);
            }
        }
        for(int i=0;i<ch.length;i++)
        {
            if(converted(ch[i]))
            {
                ch[i]=st.pop();
            }
        }
        return new String(ch);
    }
    public boolean converted(char ch)
    {
     if(ch == 'a' || ch == 'A' || ch == 'E' || ch == 'e' || ch == 'i' || ch == 'I' 
     || ch == 'o' || ch == 'O' || ch == 'u' || ch == 'U') {
         return true;
         }
        else{
     return false;
    }
}
}
