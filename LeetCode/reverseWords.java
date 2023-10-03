class Solution {
    public String reverseWords(String s) {
        int i=0,j=s.length()-1;
        while(i<=j  && s.charAt(i)==' ')
        {
            i++;
        }
        while(j>=i && s.charAt(j)==' ')
        {
            j--;
        }
        s=s.substring(i,j+1);
       String temp[]=s.split("\\s+");
       StringBuilder sb=new StringBuilder();
       for(int k=temp.length-1;k>0;k--)
       {
           sb.append(temp[k]).append(" ");
       }
       return sb.append(temp[0]).toString();
    }
}
