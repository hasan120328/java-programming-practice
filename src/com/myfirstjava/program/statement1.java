package com.myfirstjava.program;

public class statement1 {

	public static void main(String[] args) {
		
String address="delli , india ";
if(address.endsWith("india")) {
	if(address.contains("merut")) {
		System.out.print("your city is meerut");
	}
	else if( address.contains("nodia") ) {
		System.out.print("your ccity is nodia");
	}else {
		System.out.print(address.split(",")[0]);
	}
}
else {
	System.out.print("you are not living in india ");
}
		
	}

}
