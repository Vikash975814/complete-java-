import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
         int n = A.length();
         int m = B.length();
         System.out.println(n+m);
         if(A.compareTo(B)>0)
         System.out.println("Yes");
         else  
         System.out.println("No");
         A=(A.substring(0,1)).toUpperCase()+A.substring(1);
         B=(B.substring(0,1)).toUpperCase()+B.substring(1);
         System.out.print(A+" "+B);
    }
}
