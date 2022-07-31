package statics1;

public class Student {
	int rollno;
	String name;
	 
	static String college="ITs";
	
	Student(int r, String n){
		rollno=r;
		name=n;
	}
	void display() {
		System.out.print(rollno+" "+name+" "+college);
	}

}
