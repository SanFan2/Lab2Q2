package com.gl.currency;

import java.util.Scanner;

public class Driver {

			public static void main(String[] args) {
				
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter the number of total currency denominations ");
				int numberOfDenominations = sc.nextInt();
				int[] denominations = new int[numberOfDenominations];
				System.out.println("Enter the currency denomination ");
				for (int i = 0; i < numberOfDenominations; i++) {
					denominations[i] = sc.nextInt();
				}
				System.out.println("Enter the amount you'd like to pay");
				int amount = sc.nextInt();
				for (int i : denominations) {
					System.out.print(i + " ");
				}
				System.out.println();
				Currency currency = new Currency(denominations, numberOfDenominations);
				MergeSort.sort(currency.denominations, 0, numberOfDenominations - 1);
				for (int i = 0; i < numberOfDenominations; i++) {
					System.out.print(currency.denominations[i] + " ");
				}
				System.out.println();
			}

		
		
	

}
