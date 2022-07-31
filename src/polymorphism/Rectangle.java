package polymorphism;

public class Rectangle extends Shape {
	//area
	double lenght ,width;
	
	Rectangle(double length,double width){
		this.lenght=length;
		this.width=width;
	}
	
	double area() {
		System.out.print("area for rectangle: ");
		return lenght*width;
	}

}
