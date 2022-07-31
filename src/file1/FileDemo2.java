package file1;

import java.io.File;
import java.util.Formatter;
import java.util.Scanner;

public class FileDemo2 {
//write inside  file
	public static void main(String[] args) {
		
		String id,name;
		try {
			Formatter formatter=new Formatter("C:/Users/Hasan/Desktop/person/student.txt");
		
			
			Scanner input =new Scanner(System.in);
			System.out.print("how many student : ");
			int num=input.nextInt();
			
			for(int i=1; i<=num; i++) {
				System.out.println("Enter student id and Student name ");
				id=input.next();
				name=input.next();
				formatter.format("%s %s\r\n", id,name);
			}
			
			
			formatter.close();
		}catch(Exception e) {
			System.out.print(e);
		}
		
		
		
	}

}
