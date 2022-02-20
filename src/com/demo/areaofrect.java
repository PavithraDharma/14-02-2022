package com.demo;
import java.util.Scanner;
class areaofrect{
	public static void main(String args[]){
		int num1;int num2;
		double area;
		Scanner myObj = new Scanner(System.in); 
		System.out.println("Enter length of rectangle= ");
		num1= myObj.nextInt();
		System.out.println("Enter breadth of rectangle= ");
		num2=myObj.nextInt();
		area=num1*num2;
		System.out.println("Area Of rectangle= " +area);
		myObj.close();
	}
}
