package array1;

import java.util.Scanner;

public class Array5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("enter tow number");
		Scanner input=new Scanner(System.in);
		
		
		int[][] A=new int[2][3];
		int [][] B=new int[2][3];
		
		//getting input for A
		for(int row=0; row <2; row++) {
			for(int col=0;col<3;col++) {
				System.out.printf("A[%d][%d]= ",row,col);
				A[row][col] =input.nextInt();
			}
		}
		
		//printing A matrix
		
		System.out.println("A =  ");
		for(int row=0; row<2;row++) {
			for(int col=0;col<3;col++) {
				System.out.print(" "+A[row][col]);
			}
			System.out.println();
		}
		
		
		//getting input for B
		for(int row=0; row<2; row++) {
			for(int col=0; col<3; col++) {
				System.out.printf("A[%d][%d]= ",row,col);
				B[row][col] =input.nextInt();
			}
		}   
		
		
		//printing B matrix
		
		System.out.println("B = ");
		
		for(int row=0;row<2; row++) {
			for(int col=0; col<3; col++) {
				System.out.print(" "+B[row][col]);
			}
			System.out.println();
		}

	}

}
