package concurrency.deadlock;

public class ResolveDeadLockTest {
	public static void main(String[] args) {
		ResolveDeadLockTest test = new ResolveDeadLockTest();
		final A a = test.new A();
		final B b = test.new B();

		// Thread-1
		Runnable block1 = new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				synchronized (a) {
					try {

						Thread.sleep(100);

					} catch (InterruptedException e) {
						// TODO: handle exception
						e.printStackTrace();
					}

					synchronized (b) {
						System.out.println("In Block 1");
					}
				}

			}
		};

		// Thread-2
		Runnable block2 = new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub

				synchronized (b) {
					synchronized (a) {
						System.out.println("In block 2");
					}

				}

			}
		};

		new Thread(block1).start();
		new Thread(block2).start();
	}

//Resource A
	private class A {
		private int i = 10;

		public int getI() {
			return i;
		}

		public void setI(int i) {
			this.i = i;
		}
	}

//	//Resource B
	private class B {
		private int i = 20;

		public int getI() {
			return i;
		}

		public void setI(int i) {
			this.i = i;
		}
	}
}
