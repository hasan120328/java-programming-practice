package Rectangle;

public class TestRectangle {

	public static void main(String[] args) {
		Rectangle1 r1=new Rectangle1(),
		 r2=new Rectangle1();
		
		r1.insert(11, 2);
		r2.insert(3, 10);
		
		r1.calculate();
		r2.calculate();

	}

}
