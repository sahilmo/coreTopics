package concurrency.syncronization;

class Customer {
	int amount = 70000;

	synchronized void withdraw(int amount) {
		System.out.println("Initial balance :- " + this.amount);
		System.out.println("going to withdraw :-" + amount);

		if (this.amount < amount) {
			System.out.println("Less Balance , waiting for Deposite");
		}

		try {
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		this.amount -= amount;
		System.out.println("Amount Withdraw complete, Total Balance:- " + this.amount);
	}

	synchronized void deposit(int amount) {
		System.out.println("going to deposit");
		this.amount += amount;
		System.out.println("Deposit complete, Total balance :- " + this.amount);
		notify();
	}

}

class InterThreadCommunication {
	public static void main(String args[]) {
		Customer customer = new Customer();

		new Thread() {
			public void run() {
				customer.withdraw(100);
			};
		}.start();
		new Thread() {
			public void run() {
				customer.deposit(500);
			};
		}.start();

	}
}
