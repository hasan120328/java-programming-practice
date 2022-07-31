package superKeyword;

public class Car extends Vehicle {
 //color, weight  , attribute;
	int gear;
	
	Car(String c, double w , int g){
		super(c,w);
		gear=g;
	}
	
	
	void attribute() {
		super.attribute();
		System.out.println("how many gear have: "+gear);
	}
	
}
