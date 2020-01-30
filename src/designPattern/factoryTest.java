package designPattern;

interface Car {
	void run();

	void stop();
}

class Audi implements Car {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(" Audi 180 kmph");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println(" Stop Audi 10 second");
	}
}

class Bmw implements Car {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(" BMW 200 kmph");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println(" Stop 20 second");
	}

}

class CarFactory {
	public static final int AUDI = 1;
	public static final int BMW = 2;

	public static Car getCar(int c) {
		Car car = null;
		if (c == AUDI) {
		 car = new Audi();
		} else if (c == BMW) {
			car =  new Bmw();
		}
		return car;
	}
}

public class factoryTest {
	
	public static void main(String[] args) {
	Car c = null; 
		 c = CarFactory.getCar(CarFactory.AUDI);
		 drive(c);
		c  = CarFactory.getCar(CarFactory.BMW);
		drive(c);
	}
	
	public static void drive(Car car) {
		car.run();
		car.stop();
	}
}
