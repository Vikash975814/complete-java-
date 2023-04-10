class  Sum{
   static  int n1=20,n2=20,n3=20;//Static Instance
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
 System.out.println(Sum.n1);
 System.out.println(Sum.n1+Sum.n2);
 System.out.println(Sum.n1+Sum.n2+Sum.n3); 
    }
}
