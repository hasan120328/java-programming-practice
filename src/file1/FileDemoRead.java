package file1;

import java.io.File;
import java.util.Scanner;

public class FileDemoRead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			File file =new File("C:/Users/Hasan/Desktop/person/student.txt");
			Scanner scanner =new Scanner(file);
			
			while(scanner.hasNext()) {
				String id=scanner.next();
				String name=scanner.next();
				System.out.println("ID: "+id +"name: "+name);
				
			}
			scanner.close();
		}catch(Exception e) {
			
			System.out.println(e);
		}
		
	}

}
