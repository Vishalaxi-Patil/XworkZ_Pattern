package com.xworkz.techical;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number");
		int end=scanner.nextInt();

	}
	int factorial(int number,int i)
	{
		int factorial=0;
		if(number>i) {
			number*factorial(number, factorial)(number-1);
		}
		return factorial;
	}

}
