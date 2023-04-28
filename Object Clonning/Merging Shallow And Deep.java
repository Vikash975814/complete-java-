class Ractangle implements Cloneable{
    int l,b;
void getarea(){
    System.out.println("Area="+(l*b));
}
protected Object clone() throws CloneNotSupportedException{
    return super.clone();
}
}
public class InnerExc{
   public static void main(String s[])  throws CloneNotSupportedException {
  Ractangle r1=new Ractangle();
    r1.l=20;
    r1.b=10;
    r1.getarea();
Ractangle r2= (Ractangle)r1.clone();
r2.l=30;
r2.getarea();
r1.getarea();
   }
}
