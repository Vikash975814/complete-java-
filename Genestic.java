import java.util.*;
public class ExceptionExe {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number 1");
		int n1=sc.nextInt();
		System.out.println("Enter the second number");
		int n2=sc.nextInt();
		try {
			int d=n1/n2;
			System.out.println("Div="+d);
		}catch(ArithmeticException ae) {
			System.out.println(ae.getMessage());
		}
		finally{
			System.out.println("finnaly exception");
		}
		System.out.println(n1+n2);
  }
}

import java.util.*;
 class A{
	static int show(int a,int b) {
        return a/b;
	}
}
class B extends A{
	static void show() {
		System.out.println("B class");
	}
}
public class ExceptionExe{
	public static void main(String s[]) {
		System.out.println(A.show(10, 5));
		try {
			System.out.println(B.show(10,0));
		}catch(ArithmeticException ae) {
			System.out.println(ae.getMessage());
		}finally {
			System.out.println("This is a finnaly keyword");
		}
		B.show();
	}
}


import java .util.*;
public class ExceptionExe{
	public static void main(String s[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the First Number");
		int a=sc.nextInt();
		System.out.println("Enter the Second Number");
		int b=sc.nextInt();
		try {
			 int div=a/b;
			 System.out.println(div);
		}catch(ArithmeticException ae) {
			System.out.println(ae.getMessage());
		}
	}
}
