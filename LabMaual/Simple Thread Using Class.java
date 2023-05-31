public class ThreadDemo {

	public static void main(String[] args) {
		System.out.println("Main Thread Name= "+Thread.currentThread().getName());
		MyThread t1=new MyThread("Thread 1");
		t1.start();
		MyThread t2=new MyThread("Thread 2");
		t2.start();
	}

}

class MyThread extends Thread{
	String s;
	MyThread(String s){
		this.s=s;
	}
	public void run() {
		System.out.println("Thread Name= "+Thread.currentThread().getName());
	}
}
