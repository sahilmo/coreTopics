package concurrency.syncronization;

/**
 * program with synchronized method with Anonymous classes
 */
class Table2 {

	synchronized void printTable(int n) {
		for (int i = 1; i <= 5; i++) {
			System.out.println(n * i);
			try {
				Thread.sleep(400);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println(e);
			}

		}
	}

}

// By Anonymous class 

class TestSynchronization2 {
	public static void main(String[] args) {
		final Table2 obj = new Table2();

		Thread t1 = new Thread() {
			public void run() {
				obj.printTable(5);
			}
		};

		Thread t2 = new Thread() {
			public void run() {
				obj.printTable(100);
			}
		};
		t1.start();
		t2.start();
	}

}
