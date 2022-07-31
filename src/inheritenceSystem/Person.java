package inheritenceSystem;

public class Person {
	
	private String name;
    private	int id;
    
    public void setName(String name) {
    	this.name=name;
    }
    
    public String getName() {
    	return name;
    }
    
    public void setId(int id) {
    	this.id=id;
    	
    }
    public int getId() {
    	return id;
    }
	
	public void display1() {
		System.out.println("name : "+getName());
		System.out.print("id : "+getId());
	}

}
