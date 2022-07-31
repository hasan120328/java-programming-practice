package inheritenceSystem;

public class Teacher extends Person {

	//name
	//id
	
 private String job;
	
	public void setJob(String job) {
		this.job=job;
	}
	public String getJob() {
		return job;
	}
	
	public void display2() {
		display1();
		System.out.print("job : "+getJob());
	}
}
