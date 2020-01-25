package concurrency;

/**
 * Create Deamon Thread
 * */
public class DeamonThread extends Thread {
	
	public void run() {
			
		if (Thread.currentThread().isDaemon()) {
			System.out.println("This is Deamon Thread ");
		}
		else {
			System.out.println("This is normal Thread ");
		}
		
	}
	
	public static void main(String[] args) {
		
		DeamonThread t1 = new DeamonThread();
		DeamonThread t2 = new DeamonThread();
		t1.setDaemon(true);
		t1.start();
		t2.start();
		
	}

}
