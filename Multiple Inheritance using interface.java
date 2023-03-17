public class Oops {
public static void main(String s[]) {
    Bear b= new Bear ();
    b.eat();
    b.masseat();
    b.fly();
}
}
 interface Herbivore {
void eat(); 
}
interface Cornivore{
    void masseat();
}
interface Birds{
   void fly();
}
class Bear implements Herbivore,Cornivore,Birds{
   public  void eat(){
        System.out.println("Eat");
    }
    public void masseat(){
        System.out.println("Masseat");
    }
    public void fly(){
        System.out.println("Flying");
    }
}
