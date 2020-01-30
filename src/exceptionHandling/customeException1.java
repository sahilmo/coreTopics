package exceptionHandling;


 class NameNotFoundException extends Exception{

	  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	NameNotFoundException(String msj) {
		 super(msj);
	 }
}

public class customeException1 {
	
	public	void setMsj( String msj) throws NameNotFoundException{
		
			
		if (msj.equals("")) {
			throw new NameNotFoundException("Name is empty");
		}
		else {
			System.out.println(msj);
		}
	}
	public static void main(String[] args) {
	
		customeException1 e = new customeException1();
		try {
			e.setMsj("sahil");
			e.setMsj("");
		} catch (NameNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
}
