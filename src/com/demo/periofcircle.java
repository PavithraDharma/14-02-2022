package com.demo;

import java.util.Scanner;
class periofcircle{
	public static void main(String args[]){
		int num1;
		double peri;
		Scanner myObj = new Scanner(System.in); 
		System.out.println("Enter radius= ");
		num1= myObj.nextInt();
		peri=2*3.14*num1;
		System.out.println("Perimeter of circle= " +peri);
		myObj.close();
	}
}

