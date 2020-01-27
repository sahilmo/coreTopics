package exceptionHandling;

public class sample1 {

	public static void main(String[] args) {

		try {
			// Arithmetic Exception
			int data = 100 / 0;

			// Null pointer Exception
			String s = null;
			System.out.println(s.length());

			// NumberFormatException
			String s1 = "abc";
			int i = Integer.parseInt(s1);
			
			//ArrayIndexOutOfBoundsException  
		    int a[]=new int[5];  
		    a[10]=50; 
		    
		} 
		
		
		catch (ArithmeticException | NullPointerException | NumberFormatException | ArrayIndexOutOfBoundsException e ) {
			System.out.println(e);
		}
		finally {
			System.out.println("finally Always excute");
		}
		
		System.out.println("Running smooth.");
		
			
	}

}
