import java.util.*;
public class Main
{
	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the  First Number");
     int a=sc.nextInt();
     System.out.print("Enter the  Second Number");
     int b=sc.nextInt();
     System.out.print("Enter the Operator");
     char op=sc.next().charAt(0);
    switch(op)
    {
        case '+': System.out.println("Addition is (a+b) = "+(a+b));
        break;
        case '-': System.out.println("Subtraction is (a-b) = "+(a-b));
        break;
        case '/': System.out.println("Division is (a/b) = "+(a/b));
        break;
        case '*': System.out.println("multiplication is (a*b) = "+(a*b));
        break;
        case '%': System.out.println("Modulo is (a%b) = "+(a%b));
        default:
        System.out.println("Wrong Choice");
    }
}
}
