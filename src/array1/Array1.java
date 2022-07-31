package array1;

import java.util.Scanner;

public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		int [] numbers=new int[6];
		Scanner input=new Scanner(System.in);
		
		System.out.println("enter enteger number : ");
		
		
	 int sum=0;
		for(int i=1 ; i<numbers.length;i++) {
			numbers[i]=input.nextInt();
			
		}
		for(int i=1; i<numbers.length; i++) {
			 sum=sum+numbers[i];
			 
		}
		System.out.println(sum);
	
	}

}
