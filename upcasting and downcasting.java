class A{
    void display(){
        System.out.println("Class A");
    }
}
class B extends A{
    void display(){
        System.out.println("Class B");
    }
}

public class Main
{
	public static void main(String[] args) {
	 B b1=new A();  //down casting java does not support
	 b1.display();
	 A a1=new B();  // up casting java supported
	 a1.display();
	}
}
