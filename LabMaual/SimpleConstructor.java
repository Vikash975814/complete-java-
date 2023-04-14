class SimpleObject{
    SimpleObject(){
        System.out.println("It is a default constructor");
    }
    SimpleObject(int a,int b,int c){
        System.out.println("It is a Parametrized constructor");
        System.out.println("Sum is a ,b and c= "+(a+b+c));
    }
}
public class LabManual{
    public static void main(String s[]){
     SimpleObject a=new SimpleObject();
     SimpleObject b=new SimpleObject(30,40,70);
    }
}
