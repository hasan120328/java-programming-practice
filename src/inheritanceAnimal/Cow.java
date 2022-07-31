package inheritanceAnimal;

public class Cow extends Animal {

//	//name,
//	//color
//	String leg;
//	
//	public void inserted(String leg) {
//		this.leg=leg;
//	}
//	
//	public void display2() {
//		display1();
//		System.out.println("how many leg : "+leg);
//	}
	
	private int leg;
	
	public void setLeg(int leg) {
		this.leg=leg;
	}
	
	public int getLeg() {
		return leg;
		
	}
	

}
