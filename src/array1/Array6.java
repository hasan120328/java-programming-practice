package array1;

import java.util.Scanner;

public class Array6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		int [][] A=new int [3][4];
		int [][] B=new int [3][4];
		
		System.out.println("enter enteger number : ");
		
		Scanner input=new Scanner(System.in);
		
		//getting input
		for(int row=0;row<3;row++) {
			for(int col=0;col<4;col++) {
				A[row][col]=input.nextInt();
			}
		}
		//output for matrix
		
		for(int row = 0;row <3; row++) {
			for(int col=0; col<4;col++) {
				System.out.print(" "+A[row][col]);
			}
			System.out.println();
			
		}
		
		
	
	}

}
