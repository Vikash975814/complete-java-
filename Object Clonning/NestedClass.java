class Outer{
    int n1=30,n2=20;
    void display(){
        System.out.println("It is a Outer class");
    }
    void show(){
        System.out.println(n1+n2);
    }
    static class Nested{
        int n1=50,n2=30;
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
        Outer.Nested in1=new Outer.Nested();
        in1.display();
        in1.show();
    }
}
