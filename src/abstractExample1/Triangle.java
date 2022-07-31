package abstractExample1;

public class Triangle extends Shape{
	
	//dim1,dim2

	Triangle(double dim1, double dim2){
			//super(dim1,dim2);
			super(dim1,dim2);
		}
		
		void  Area() {
			
	      double result=0.5*dim1*dim2;
	      System.out.println("triangle area: "+result);
			
		}
	
}
