package javaThrows1;

public class ParentsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		
		Parent p =new Children();
		
		try {
			p.msg();
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
