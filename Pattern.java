import java.util.*; 
public class Pattern {
    public static void main(String s[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of N");
        int N=sc.nextInt();
        int a=1;
        char b='A';
        for(int i=1;i<=N;i++)
        {
            if(i%2!=0){
            for(int j=1;j<=i;j++)
            {
                  System.out.print(" "+a);
                  a++;
            }
            System.out.println();
            }else{
            for(int j=1;j<=i;j++)
            {
                  System.out.print(" "+b);
                  b++;
            }
            System.out.println();
        }
    }
        }
    }
    
    import java.util.*;
    public class Pattern{
        public static void main(String s[]){
            Scanner sc=new Scanner (System.in);
            System.out.println("Enter the value of N");
            int n=sc.nextInt();
            int k;
            for(int i=1;i<=n;i++){
                if(i%2==0)
                k=0;
                else 
                k=1;
                {
                for(int j=1;j<=i;j++){
                    System.out.print(" "+k);
                    if(k==1)
                    k=0;
                    else
                    k=1;
                }
                System.out.println();
            }
        }
    }
    }
