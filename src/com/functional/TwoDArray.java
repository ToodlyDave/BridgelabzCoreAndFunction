package com.functional;

import java.util.Scanner;

public class TwoDArray {

	public void twoArray() {
		Scanner scan = new Scanner(System.in);
		int[][] array = new int[50][50]; 
		
		System.out.print(" Please enter the value of m: ");
		int m = scan.nextInt();
		
		System.out.print(" Please enter the value of n: ");
		int n = scan.nextInt();
		
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(" Please enter number: ");
				array[i][j] = scan.nextInt();
			}
		}
		
		System.out.println(" The array: ");
		
		for (int i = 0; i < m; i++) {
			System.out.println();
			for (int j = 0; j < n; j++) {
				System.out.print(" " + array[i][j]);
			}
		}
		
		scan.close();	
		
	}
}
