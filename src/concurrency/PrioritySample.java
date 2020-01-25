package concurrency;

public class PrioritySample extends Thread{
	
	public void run() {
		System.out.println("Thread name "+ Thread.currentThread().getName());
		System.out.println("       id "+ Thread.currentThread().getId());
		System.out.println("       Priority "+ Thread.currentThread().getPriority());
	}
	
	public static void main(String[] args) {
		PrioritySample t1 = new PrioritySample();
		PrioritySample t2 = new PrioritySample();
		t1.setName("t1 ");
		t2.setName("t2 ");
		
		t1.setPriority(MIN_PRIORITY);
		t2.setPriority(MAX_PRIORITY);
		
		t1.start();
		t2.start();
	}
	
}
