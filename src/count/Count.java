package count;

public class Count {
	
	String name;
	int id;
	float amount;
	
	void insert(String n, int i, float a) {
		name = n;
		id=i;
		amount=a;
	}
	
void versityName(String name){
	System.out.print(name);
}

void universityId(int id) {
	System.out.print(id);
}

void widthrawAmount(float a) {
	
	amount=amount+a;
	System.out.print(a+"amount");
	
}

	void display() {
		System.out.print(amount+" "+id);
	}

}
