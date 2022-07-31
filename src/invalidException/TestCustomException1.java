package invalidException;

public class TestCustomException1 extends AfterAgeException {
	public static void main(String args[])  {
    	try {
    		validate(12);
    	}catch(Exception e) {
    		System.out.println("Caught the exception");
    		
    		System.out.println("Exception occured: "+e);
    		
    	}
    	System.out.println("rest of the code");
    }
}
