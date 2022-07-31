package staticblock;

public class StaticBlock {
	
	static int id;
	static String name;
	
	static {
		id=101;
		name="hasan";
	}
	static void display() {
		System.out.print("id: "+id);
		System.out.print("name"+name);
	}
	public static void main(String[] args) {
		StaticBlock.display();
	}

}
