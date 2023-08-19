class MyThread extends Thread{
	String s=null;
	MyThread(String s1){
		s=s1;
		start();
	}
	public void run() {
		System.out.println(s);
	}
}
public class ExceptionUser{
	public static void main(String s[]) {
		MyThread m1=new MyThread("Thread created------");
	}
}
