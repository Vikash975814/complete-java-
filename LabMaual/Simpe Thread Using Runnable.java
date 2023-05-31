class MyThread implements Runnable{
	public void run() {
		System.out.println("Thread Name= "+Thread.currentThread().getName());
	}
}
public class ThreadDemo {

	public static void main(String[] args) {
		System.out.println("Main Thread Name= "+Thread.currentThread().getName());
		Thread t1=new Thread(new MyThread());
		t1.setName("Thraed 1");
		t1.start();
		Thread t2=new Thread(new MyThread());
		t2.setName("Thread 2");
		t2.start();
	}

}
