package com.demo;

import  java.util.Scanner;
class Mul {
	public static void main(String args[]){
		int num1;
		int num2;
		int mul;
		Scanner myObj = new Scanner(System.in); 
		System.out.println("val1= ");
		num1= myObj.nextInt();
		System.out.println("val2= ");
		num2=myObj.nextInt();
		mul=num1*num2;
		System.out.println("Mul= " +mul);
		myObj.close();
	}
}

