package com.arrayproblem;

import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int[] studentmarks = new int [3];
//		studentmarks[0] = 70;
//		studentmarks[1] = 90;
//		studentmarks[2] = 99;
//		
//		for (int i = 0; i<3 ; i++) {
//			System.out.println(studentmarks[i]);
//		}
		
		
		
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter The Size Of Array : ");
		int size = sc.nextInt();
		
		int number[] = new int [size];
		
		// Input 
		for(int i = 0; i<size ; i++) {
			System.out.println("Enter the array values");
			number[i] = sc.nextInt();
		}
		
		
		// output
		for(int i = 0; i<size ; i++) {
			System.out.print(number[i]);
		}
	}

}
