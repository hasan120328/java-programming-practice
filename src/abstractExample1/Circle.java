package abstractExample1;

public class Circle extends Shape {
	
	//dim1,dim2;
	//area =3.14 *r*r
	
	Circle(double r){
		super(r,r);
	}
	
	void Area() {
		
	 double result=Math.PI*dim1*dim2;
	 System.out.print("circle area: "+result);
		
	}
	
	
}
