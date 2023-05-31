public class ThreadDemo{
	public static void main(String s[]) {
		new Thread(new Runnable() {
			public void run() {
				for(int i=0;i<10;i++) {
				System.out.println("Thread "+ i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			}
		}).start();
		new Thread(()->System.out.println("Thread 2")).start();
	}
}
