package linkList;

import java.util.LinkedList;

public class LinkListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> countryNames=new LinkedList<String>();
		
		countryNames.add("bangladesh");
		countryNames.add("india");
		countryNames.add("pakistan");
		countryNames.add("Nepal");
		countryNames.addFirst("afganistan");
		countryNames.addLast("japan");
//		countryNames.remove("japan");
//		countryNames.remove(7);
//		countryNames.removeFirst();
//		countryNames.removeLast();
		
		
		for(String country : countryNames) {
			System.out.println(country);
		}
		
		System.out.println("size of the likedlist : "+countryNames.size());
		System.out.println("first element : "+countryNames.getFirst());
		System.out.println("last element : "+countryNames.getLast());
  
		countryNames.clear();
		System.out.println(countryNames);
		
		
	}

}
