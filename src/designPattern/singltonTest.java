package designPattern;

class Hello {
  
 private Hello(){}
  
 static Hello h = null;

 static {
  h = new Hello();
 }

 public static Hello getHelloObj() {
		return h;
	}
 

}

public class singltonTest {

	public static void main(String[] args) {
//		Hello h1 = new Hello();
//		Hello h2 = new Hello();
//		System.out.println(h1 == h2); 
		
	Hello h1 =  Hello.getHelloObj();
	Hello h2 =  Hello.getHelloObj();
	
	System.out.println(h1 == h2);
		
	}

}
