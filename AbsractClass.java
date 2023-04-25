abstract class Mult{
 abstract void add();
 void massage(){
  System.out.println("This is a super class");
 }
}
class Sum extends Mult{
void add(){
System.out.println("This is a sub class");
}
}
public class ClassRoom{
  public static void main(String s[]){
   Sum s1=new Sum();
   s1.add();
   s1.massage();
  }
}
