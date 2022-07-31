package exception_handling;

public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			int x=10;
			int y=0;
			int result=x/y;
			
			System.out.println(result);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}catch(ArithmeticException e) {
			System.out.println(e);
		}
		
		finally {
			System.out.println("last line of the program");
		}

	}

}
