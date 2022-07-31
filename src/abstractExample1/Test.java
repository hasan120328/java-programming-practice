package abstractExample1;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//we can create referance veriable of abstract class but we can't create object;
		
		Shape shape;
		shape=new Rectangle(12,33);
		shape.Area();
		
		shape=new Triangle(10,20);
		shape.Area();
		
		shape=new Circle(12);
		shape.Area();
		

	}

}
