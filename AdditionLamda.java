interface A{
	int add(int a,int b);
}
public class ExceptionUser{
	public static void main(String s[]) {
		A a1= (a,b)->a+b; 
		System.out.println(a1.add(23,45));
	}
