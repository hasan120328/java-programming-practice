package javaThrows1;

public class TestThrow1 {

	public static void main(String[] args) {
		
		Throws1 ob=new Throws1();
		
		try {
			int result=ob.checkNum(10, 0);
			System.out.println(result);
			
		}catch(Exception e) {
			System.out.print("\n Number cannot be divided by 0"+e);
		}
		
		System.out.println("Rest of the code");

	}

}
