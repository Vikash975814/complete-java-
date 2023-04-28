class Outer{
    int n1=30,n2=20;
    void display(){
        System.out.println("It is a Outer class");
    }
    void show(){
        System.out.println(n1+n2);
    }
    class Inner{
        void display(){
            System.out.println("It is a inner class");
        }
        void show(){
            System.out.println(n1+n2);
        }
    }
}
public class InnerExc{
    public static void main(String s[]){
        Outer o1=new Outer();
        o1.display();
        o1.show();
        Outer.Inner in1=o1.new Inner();
        in1.display();
        in1.show();
    }
}
