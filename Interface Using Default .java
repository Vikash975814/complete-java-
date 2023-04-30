interface SuperInterface{
    void show();
   default void display(){
  System.out.println("This is super class");
    }
}
class SubClass implements SuperInterface{
   public void show(){
        System.out.println("This is sub class");
    }
}
public class Main{
public static void main(String s[]){
SubClass sc=new SubClass();
sc.show();
sc.display();
}    
}
