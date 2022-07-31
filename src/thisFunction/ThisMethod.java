package thisFunction;

public class ThisMethod {
	
	String name,university;
	int id;
	
void inserted(String name, String university,int id ) {
	this.name=name;
	this.university=university ;
	this.id=id;
}

void display() {
	System.out.println("my name: "+name);
	System.out.println("university name: "+university);
	System.out.println("id is: "+id);
}
}
