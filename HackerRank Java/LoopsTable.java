import java.util.*;
public class Solution{
    public static void main(String s[]){
        Scanner sc= new Scanner (System.in);
        int N= sc.nextInt();
        int result;
        for(int i=1;i<=10;i++)
        {
            result=N*i;
            System.out.println(N +" x "+i +" = "+result);
        }
    }
}
