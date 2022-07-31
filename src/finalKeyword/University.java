package finalKeyword;

public class University {
	
	final String UNIVERSITY_NAME="LU";
	static final int fees;
	
//	final int fees;
//	
//	University(){
//		fees=13;
//	}
	
	static {
		fees=3755;
	}
	
	void display() {
		System.out.print(UNIVERSITY_NAME);
		System.out.print(fees);
	}

}
