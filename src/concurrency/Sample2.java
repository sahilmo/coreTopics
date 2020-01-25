package concurrency;

public class Sample2 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println( "Thread s2 running ");
		
		for (int i = 0; i < 5; i++) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		Sample2 s2 = new Sample2();
		Thread t1 = new Thread(s2);
		Thread t2 = new Thread(s2);
// *************** case 1 *****************************	
//with start();
		t1.start();
		t2.start();
		
// *************** case 2 *****************************	
// Same thread can't be start again  ,If you does so, an IllegalThreadStateException
//		t1.start();

// *************** case 3 *****************************	
// If we call directly run() it will be treated as normal object not thread object
		// t1.run();
		// t2.run();
		
		
		
	}

}
