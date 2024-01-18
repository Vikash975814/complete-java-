import java.util.*;
public class Main
{
	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the Choice Number");
     int n=sc.nextInt();
    switch(n)
    {
        case 1: System.out.println("Burger");
        break;
        case 2: System.out.println("Samosa");
        break;
        case 3: System.out.println("tea");
        break;
        case 4: System.out.println("BreadPakoda");
        break;
        default:
        System.out.println("Chaumin");
    }
}
}
