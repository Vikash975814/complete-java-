class MyThread extends Thread{
	String s;
	MyThread(String s){
		this.s=s;
		start();
	}
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("Thread Name= "+Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
public class ThreadDemo{
	public static void main(String s[]) {
		System.out.println("Main THread Name= "+Thread.currentThread().getName());
		MyThread m1=new MyThread("Thread 1");
		m1.setPriority(Thread.MAX_PRIORITY);
		int p1=m1.getPriority();
		System.out.println("Thread  Maximum Priority ="+ p1);
		MyThread m2=new MyThread("Thread 2");
		m2.setPriority(Thread.MIN_PRIORITY);
		int p2=m2.getPriority();
		System.out.println("Thread Minimum Priority ="+ p2);		
	}
}
