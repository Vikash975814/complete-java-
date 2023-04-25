interface Mult{
   void add(int num1,int num2);
   void show();
  }
  class MultImp implements Mult{
   public  void add(int num1,int num2){
    System.out.println("sum="+(num1+num2));
    }
    public void show(){
  System.out.println("This is a interface");
    }
  }
  public class ClassRoom{
    public static void main(String s[]){
      MultImp ob=new MultImp();
      ob.add(40,20);
      ob.show();
    }
  }
