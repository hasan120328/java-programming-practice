package com.myfirstjava.program;

import java.util.Scanner;

public class PatternDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner (System.in);
		System.out.println("please enter line number : "); 
  int n=input.nextInt();
  
		for(int row =1; row<=n; row++) {
			for(int col=1; col<=row; col++) {
				System.out.println(" "+col); 
			}
			System.out.println(); 
		}
	}

}

