package decimalFormat;

import java.text.DecimalFormat;

public class DecimalNumberFormatDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  DecimalFormat ob=new DecimalFormat("0.00");
		 double x=2.9878678;
		 
		 System.out.println("x = "+ob.format(x));
		 

	}

}
