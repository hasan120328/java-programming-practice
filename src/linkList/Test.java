package linkList;

import java.util.LinkedList;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Student linkedList
		
		LinkedList<Student> list=new LinkedList<Student>();
		
		//student create
		
		Student s1=new Student(101,"Karim","Eleven");
		Student s2=new Student(102,"hasan","twelve");
		Student s3=new Student(103,"iasan","third");
		Student s4=new Student(104,"kasan","twelve");
		
		
		//adding student to the studentList
		
		list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        
        //information display
        
        for(Student s : list) {
        	System.out.println(s.id + " "+s.name + " "+s.className);
        }
        
        
	}

}
