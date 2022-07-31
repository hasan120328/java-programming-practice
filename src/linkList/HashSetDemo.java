package linkList;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet <String> fruitsName=new HashSet<String>();
		
		fruitsName.add("apple");
		fruitsName.add("japel");
		fruitsName.add("kapple");
		
		System.out.println(fruitsName);
		System.out.println("size = "+fruitsName.size());
		
		
		fruitsName.remove("Apple");
		System.out.print(fruitsName);
		
		fruitsName.clear();
		System.out.println(fruitsName);
		
		boolean value =fruitsName.isEmpty();
		System.out.println(value);

	}

}
