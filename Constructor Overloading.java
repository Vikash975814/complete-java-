class  Sum{
    int n1,n2,n3;
    Sum(){

    }
    Sum(int num1,int num2){
        n1=num1;
        n2=num2;
    }
    Sum(int num1,int num2,int num3){
        n1=num1;
        n2=num2;
        n3=num3;
    }
}
public class Construter{
    public static void main(String s[]){
 Sum s1=new Sum();
 System.out.println(s1.n1);
 Sum s2=new Sum(55,55);
 System.out.println(s2.n1+s2.n2);
 Sum s3=new Sum(55,55,55);
 System.out.println(s3.n1+s3.n2+s3.n3); 
    }
}
