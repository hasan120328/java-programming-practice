package objectCon;

public class objectCon {
	String name,gender;
	int phone;
	
	objectCon(  ){
		System.out.print("no value");
		
		};
		
	objectCon(String n, String m  ){
		name=n;
		gender=m;
		
		};
	objectCon(String n, String m , int ph){
	name=n;
	gender=m;
	phone=ph;
	}
	
	void displayInformation() {
		System.out.println(name);
		System.out.println(gender);
		System.out.println(phone);
	}
	

}
