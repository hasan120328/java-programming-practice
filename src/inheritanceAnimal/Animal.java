package inheritanceAnimal;

public class Animal  {
//	String name;
//	String color;
//	
//	public void inserted(String name, String color) {
//		this.name=name;
//		this.color=color;
//	}
//	
//	public void display1() {
//		System.out.println("name is : "+name);
//		System.out.println("color is : "+color);
//	}
	
	
	private String name;
	private String color;
	
	public void inserted(String name, String color) {
	this.name=name;
	this.color=color;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	
	
	

}
