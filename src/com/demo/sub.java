package com.demo;

import java.util.Scanner;
class sub{
	public static void main(String args[]){
		int num1;
		int num2;
		int sub;
		Scanner  myObj = new Scanner(System.in); 
		System.out.println("val1");
		num1= myObj.nextInt();
		System.out.println("val2");
		num2=myObj.nextInt();
		sub=num1-num2;
		System.out.println("Sub" +sub);
		myObj.close();
	}
}
