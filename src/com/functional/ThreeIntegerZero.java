package com.functional;

import java.util.Scanner;

public class ThreeIntegerZero {
	
	public void integer() {
		Scanner scan = new Scanner(System.in);
		
		System.out.print(" Please enter n value: ");
		int n = scan.nextInt();
		
		int [] array = new int[n];
		
		for (int i = 0; i < n; i++) {
			System.out.print(" Please enter the " + (i + 1) + " element: ");
			array[i] = scan.nextInt();
		}
		
		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				for (int k = j; k < n; k++) {
					if (array[i] + array[j] + array[k] == 0) {
						System.out.println(" the numbers " + array[i] + ", " + array[j] + ", " + array[k] + " add to 0");
					}
				}
			}
		}
		
		scan.close();
	}

}
