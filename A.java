 abstract class Display{
     abstract void massage();
     void printmassage(){
        System.out.println("Hello java");
     }
}
class Message extends Display{
     void massage(){
        System.out.println("Java is a good language");
     }
}
class Deside extends Display{
    void massage(){
        System.out.println("Java is a programming language");
    }
}
class Challenge extends Message{
    void massage(){
        System.out.println("this is sub class");
    }
    void massagep(){
       System.out.println("Java is a oop language");
    }
}
public class AbstractMet {
    public static void main(String s[]){
   Challenge c=new Challenge();
     c.massage();
     c.massagep();
     c.printmassage();
    }
}
