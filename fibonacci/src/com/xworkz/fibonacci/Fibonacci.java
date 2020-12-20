package com.xworkz.fibonacci;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number");
		int end=scanner.nextInt();
		Fibonacci  fibonacci=new Fibonacci();
		fibonacci.fibonacci(end);
		
		

	}
	void fibonacci(int number)
	{
		int fibonacci=0;
		int a=0;
		int b=1;
		int total=0;
		total=a+b;
		a=b;
		b=total;
		fibonacci=total;
		while(number>fibonacci) {
			total=a+b;
			fibonacci+=total;
			System.out.println(fibonacci);
		}
	}

}
