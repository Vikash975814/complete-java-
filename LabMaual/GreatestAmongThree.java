import java.util.*;
class Greatest{
    int N1,N2,N3;
    void add(){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the First Numbers");
     N1=sc.nextInt();
     System.out.print("Enter the Second Numbers");
     N2=sc.nextInt();
     System.out.print("Enter the Third Numbers");
     N3=sc.nextInt();
     if(N1>(N2&N3)){
        System.out.println("First Number= "+ N1 + " Is Greatest");
     }else if(N2>N3){
        System.out.println("Second Number= "+ N2 + " Is Greatest");
     }else{
        System.out.println("Third Number= "+ N3  + " Is Greatest");
     }
    }
}
public class LabManual {
    public static void main(String s[]){
     Greatest g=new Greatest();
     g.add();
    }
}
