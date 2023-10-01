class Solution {
    public String reverseWords(String s) {
    String str="";
    String word[]=s.split("\\s");
     for(String x:word)
     {
         StringBuilder sb=new StringBuilder(x);
         sb.reverse();
         str+=sb.toString()+" ";
     }
     return str.trim();
    }
}
