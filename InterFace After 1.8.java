interface Super{
    default void display(){
        System.out.println("This is default method in interface");
        display1();
    }
    private void display1(){
        System.out.println("This is private method in interface");
    }
    static void display2(){
        System.out.println("This is static method in interface");
        display3();
    }
    private static void display3(){
        System.out.println("This is private static method in interface");
    }
}
class Sub implements Super{


}
public class Main
{
	public static void main(String[] args) {
	Sub s1=new Sub();
	s1.display();
	Super.display2();
	}
}
