package concurrency.syncronization;

/**
 * program with synchronized block
 */
class Table3 {

	void printTable(int n) {
		// synchronized specific block only
		synchronized (this) {
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
}

// By Anonymous class 

class TestSynchronization3 {
	public static void main(String[] args) {
		final Table3 obj = new Table3();

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
