import java.util.*;
public class Main
{
    public static void larger(String s)
    {
        String r="",l="";
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!=' ')
            {
                r=r+s.charAt(i);
            }
            else
            {
                if(r.length()>l.length())
            {
                l=r;
            }
              r="";
            }
        }
        System.out.println("Largest word="+l);
    }
public static void main (String[] args)
{
    String s="This is the Greatest Number";
    larger(s);
}
    }
