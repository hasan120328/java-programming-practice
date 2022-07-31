package file1;

import java.io.File;

public class FileDemo1 {
//file created 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File dir=new File("C:/Users/Hasan/Desktop/person");
		dir.mkdir();
		
	String path=	dir.getAbsolutePath();
	System.out.println(path);
//	
//	System.out.println(dir.getName());
//	
//	if(dir.delete()) {
//		System.out.println(dir.getName()+"folder has been deleted");
//	}

	File file1=new File(path+"/student.txt");
	File file2=new File("C:/Users/Hasan/Desktop/person/teacher.txt");
		
	
	try {
    file1.createNewFile();
    file2.createNewFile();			
			System.out.println("Files are created");
	}catch(Exception e) {
		System.out.println(e);
		
	}
	
//	file2.delete();
//	if(file2.exists()) {
//		System.out.println("file exists");
//	}else {
//		System.out.print("file does not exists");
//	}
		
	}

}
