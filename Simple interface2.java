interface Mult{
  void add(int num1,int num2);
  void show(int x,int y);
}
interface Sum extends Mult{
  void result(int a,int b,int c);
}
public class ClassRoom{
  public static void main(String s[]){
      Sum m=new Sum() { 
      public void add(int num1,int num2){
        System.out.println("sum="+(num1+num2));
      }
      public void show(int x,int y){
       System.out.println(x-y);
      }
      public void result(int a,int b,int c){
        System.out.println("Sum="+(a+b+c));
      }
    };
    m.add(40,20);
    m.show(50,30);
    m.result(10,20,30);
  }
}
