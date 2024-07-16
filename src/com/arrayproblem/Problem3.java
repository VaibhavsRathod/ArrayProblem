package com.arrayproblem;

import java.util.Scanner;

public class Problem3 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

		// Take an array as input from the user. Search for a given number x and print the index at which it occurs.
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Enter the size of the Array : ");
		int size = sc.nextInt();
		
		int number [] = new int [size];
		
	// input 
		
		for(int i = 0; i<size ;i++) {
			number[i] = sc.nextInt();
		}
		
		System.out.print("Enter the x to find it's position : ");
		int x = sc.nextInt();
		
		// output 
		
		for(int i = 0 ; i<number.length; i++) {
			if(number [i] == x ) {
				System.out.println("The x is  at Idex No : " +i);
			}
		}
	}

}
