package linkList;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//put ,get 
		
		HashMap <Integer,String> customer =new HashMap<Integer,String>();
		
		customer.put(101, "hasan");
		customer.put(102, "hosen");
		customer.put(103, "jakir");
		
		
		System.out.println(customer.get(103));

	}

}
