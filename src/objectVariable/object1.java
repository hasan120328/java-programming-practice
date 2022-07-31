package objectVariable;

public class object1 {
	
	String name , gender;
	int phone;
	
	void setInformation(String n, String m, int ph) {
		name=n;
		gender=m;
		phone=ph;
	}
	
	void displayInformation() {
		System.out.print("name"+name);
		System.out.print("gender:"+gender);
		System.out.print("phone:"+phone);
		System.out.println();
	}
	

}
