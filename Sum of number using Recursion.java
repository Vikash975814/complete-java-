import java.util.Scanner;

public class Recursion {
    static int rec(int a){
        int sum=0;
        if(a==0){
            sum=sum+a;
            return sum;
        }
        if(a==1){
            sum=sum+a;
           return sum;
        }
        else{
            sum=sum+rec(a-1)+rec(a-2);
           return sum;
        }

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.println(rec(i));
        }
    }
}
