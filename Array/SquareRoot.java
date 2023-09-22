import java.util.*;
public class Main{ 
public static void main (String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number");
    int n=sc.nextInt();
    int h=0;
    int i=1;
    while(i<=n)
    {
        if(i*i==n)
        {
        h=i;
        }
        i++;
    }
    if(h==0)
    {
        System.out.println("Sqare root does not exist of this number");
    }else
    {
    System.out.println("Square root is="+h);
}
}
}
