package inheritanceAnimal;

public class GrandSonCow extends SubCow{
//	int age;
//	public void inserted(int age) {
//		this.age=age;
//	}
//	public void display4() {
//		display3();
//	}
	
  private int age;
  
  public void setAge(int age) {
	  this.age=age;
  }
  
  public int getAge() {
	  return age;
  }
  
  public void display() {
	  System.out.println(getName());
		System.out.println(getColor());
		 System.out.println(getAge());
	     System.out.println(getGender());
	     System.out.println(getLeg());
  }

}
