import java.util.Scanner;

public class Leapyear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        if(a%100==0) {
            System.out.println("Given Year is century year");
            if (a % 400 == 0) {
                System.out.println("Given Year is  leap year");
            }
        }
        else if (a % 4 == 0 ){
            System.out.println("Year is leap year");
        }
        else{
            System.out.println("Year is not leap year");
        }
    }
}
