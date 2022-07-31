package array1;

import java.util.Scanner;

public class Array2 {
	public static void main(String[] args) {  
		
		Scanner input=new Scanner (System.in);
		
		double [] number =new double[5];
		double sum=0;
		
		System.out.println("please enter 5 numbers : ");
		
		for(int i=0; i<number.length; i++) {
			number[i]=input.nextDouble();
		}
		
		for(int i=0;i<number.length;i++) {
			sum = sum+ number[i];//sum=15;
		}
		System.out.println("The sum is : "+sum);
		
		
		double max=number[0];
		double min=number[0];
		
		for(int i=1; i<5; i++) {
			if(max < number[i]) {
				max=number[i];
			}
			if(min > number[i]) {
				min=number[i];
			}
		}
		System.out.print("maximum = "+max);
		System.out.println("minimum = "+min);

	}
	
}
