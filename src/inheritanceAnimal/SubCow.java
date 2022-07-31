package inheritanceAnimal;

public class SubCow extends Cow {
//	String gender;
//	public void inserted(String gender) {
//		this.gender=gender;
//	}
//	public void display3() {
//		display2();
//		System.out.println("gender of cow : "+gender);
//	}
	
	private String gender;
	
	public void setGender(String gender) {
		this .gender=gender;
	}
	
	public String getGender() {
		return gender;
	}

}
