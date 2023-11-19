class Solution {
    public String makeFancyString(String s) {
    char p=s.charAt(0);
    int f=1;
    StringBuilder sb=new StringBuilder();
    sb.append(p);
    for(int i=1;i<s.length();i++)
    {
        if(s.charAt(i)==p)
        {
         f++;
        }else{
            f=1;
        }
        p=s.charAt(i);
        if(f<3)
        {
            sb.append(s.charAt(i));
        }
    }
    return sb.toString();
    }
}
