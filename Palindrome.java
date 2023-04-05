import java.util.*;
public class Oops{
    public static void main(String s[]){
   Scanner sc=new Scanner(System.in);
   System.out.print("Enter the number");
     int num=sc.nextInt();
     int sum=0,rev;
       int num1=num;
       while(num>0)
       {
        rev=num%10;
        sum=(sum*10)+rev;
        num=num/10;
       }
       System.out.println("Your reverse number is:"+sum);
       if(sum==num1)
       {
        System.out.println("Number is Palindrome");
       }else{
        System.out.println("Number is not palindrome");
       }
    }
}
