class Ractangle{
    int l,b;
void getarea(){
    System.out.println("Area="+(l*b));
}
}
public class InnerExc {
   public static void main(String s[]) {
  Ractangle r1=new Ractangle();
    r1.l=20;
    r1.b=10;
    r1.getarea();
    Ractangle r2=r1;
    r2.b=30;
    r2.getarea();
    r1.getarea();
   }
}
