package objectCon;

public class test {
	public static void main(String[] args) {
		
		objectCon ob1=new objectCon();
		ob1.displayInformation();
		
		objectCon ob2=new objectCon("Md hasan","male");
		ob2.displayInformation();
		
		objectCon ob3=new objectCon("Md hasan","male",243);
		ob3.displayInformation();
	}
}
