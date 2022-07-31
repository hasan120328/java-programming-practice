package exceptionHandlingExample;
import java.util.Scanner;

public class ExceptionProblemDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		
		int count=1;
		do {
			try {
				Scanner input=new Scanner(System.in);
				
				System.out.println("Please enter num1 : ");
				int num1=input.nextInt();
				
				System.out.println("please enter num2");
				int num2=input.nextInt();
				
				int result=num1/num2;
				
				System.out.println("Result  :"+num1+"/"+num2+ " = " +result);
				count=2;
			}catch(Exception e) {
				System.out.print("Exception: "+e);
				System.out.println(" please enter integer ,please try again");
			}
			
			
		}while(count==1);
	}

}
