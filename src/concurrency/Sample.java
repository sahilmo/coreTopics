package concurrency;

public class Sample extends Thread{
	
	public void run() {
		System.out.println("running");
	}
	
	public static void main(String[] args) {
		Sample s1 = new Sample();
		s1.start();	
		System.out.println(
				" id "+s1.getId()+
				" name "+ s1.getName()+
				" isAlive "+s1.isAlive());
	}

}
