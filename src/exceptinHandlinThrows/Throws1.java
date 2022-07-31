package exceptinHandlinThrows;

import java.io.IOException;

public class Throws1 {
	
	void m()throws IOException {
		throw new IOException("device error");
	}
	
	void n()throws IOException {
		m();		
	}
	void p() {
		   
		try{
			n();
		}catch(Exception e) {
			System.out.println("exception handled");
		}
	}

}
