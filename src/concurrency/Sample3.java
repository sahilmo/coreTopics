package concurrency;

/**
 * Example of join() method
 * set and get thread name 
 * */
public class Sample3 extends Thread{
	
	public void run () {
		System.out.println("Running Thread.. "+ Thread.currentThread().getName());
		
		for (int i = 0; i < 5; i++) {
			
			try {
				Thread.sleep(1000);
				if (Thread.currentThread().getName().equals("T-3")) {
					Thread.sleep(1000);
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+" "+ i +" "+  java.time.LocalTime.now());
		}
	}

	
	
	public static void main(String[] args) {
		Sample3 t1 = new Sample3();
		Sample3 t2 = new Sample3();
		Sample3 t3 = new Sample3();
		
		t1.start();
		t1.setName("T-1");
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("t1 isAlive "+ t1.isAlive());
		t2.setName("T-2");
		t3.setName("T-3");
		t2.start();
		t3.start();
		
		

		
		
	}

}
