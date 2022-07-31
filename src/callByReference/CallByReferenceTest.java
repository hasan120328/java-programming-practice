package callByReference;

public class CallByReferenceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		CallByReference r1=new CallByReference();
		r1.name="arshad";
		System.out.print("before reference "+r1.name);
		
		r1.change(r1);
		System.out.print("after reference: "+r1.name);
	}

}
