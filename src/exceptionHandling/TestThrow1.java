package exceptionHandling;

public class TestThrow1 {
	
	static void validate (int age) throws ArithmeticException{
		if(age <18) {			
			throw new ArithmeticException("not valid");
		}else {
			System.out.println("welcome to vote");
		}
	}
	
	public static void main(String[] args) {
			
		validate(13);
		System.out.println("rest runing....");
	}
}
