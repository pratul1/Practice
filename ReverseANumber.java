package com.prac.basic;

import java.util.Scanner;

public class ReverseANumber {
	
	public static void main(String[] args) {
		
		
		int num = 0;
		int reversenum = 0;
		
		System.out.println("Enter the number nad press enter:");
		
		Scanner scan = new Scanner(System.in);
		
		num = scan.nextInt();
		
		while(num!=0)
		{
			reversenum = reversenum*10;
			reversenum = reversenum + num%10;
			num = num/10;
		}
		
		System.out.println("Reversed number: " + reversenum);
		
		
		int[] array = new int[6];
		int[] array1 = new int[]{1,2,3,4,5,6};
		int[] array2 = {1,2,3,4,5,6};
		
 		
		
	}

}
