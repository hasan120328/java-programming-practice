package boxExample;

public class BoxExample {
	
	double height ;
	double width;
	double depth;
	
	BoxExample(double h,double w, double d){
		height=h;
		width=w;
		depth=d;
	}
	
	void displayBox1() {
		
		double result=height*width*depth;
		System.out.print(result);
		
	}
	

	
	

}
