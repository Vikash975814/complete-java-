class Storage{
	boolean printed =true;
	int i;
	public void setValue(int i) {
		this.i=i;
	}
		public int getValue() {
			return this.i;
		}
		public boolean isPrinted() {
			return printed;
		}
		public void setPrinted(boolean p) {
			printed=p;
		}
	}
class Printer implements Runnable{
       Storage st;
       public Printer(Storage st) {
    	   this.st=st;
       }
	public void run() {
		synchronized(st) {
			for(int i=0;i<10;i++) {
				while(st.isPrinted()) {
					try {
						st.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				System.out.println(Thread.currentThread().getName() + " "+ st.getValue());
				st.setPrinted(true);
				st.notify();
			}
		}
	}
	
}
class Counter implements Runnable{
    Storage st;
    public Counter(Storage st) {
 	   this.st=st;
    }
	public void run() {
		synchronized(st) {
			for(int i=0;i<10;i++) {
				while(st.isPrinted()) {
					try {
						st.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				System.out.println(Thread.currentThread().getName() + " "+ st.getValue());
				st.setPrinted(false);
				st.notify();
			}
		}
	}
	
}
 public class ThreadDemo{
	public static void main(String s[]) {
		Storage st=new Storage();
		Counter c=new Counter(st);
		Printer p=new Printer(st);
		new Thread(c,"Counter ").start();
		new Thread(p,"Printer").start();
	}
}
