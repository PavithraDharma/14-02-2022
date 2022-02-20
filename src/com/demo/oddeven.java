package com.demo;

public class oddeven
{
	public static void main(String[] args) 
	{
		int num=10;
		if(num >=0)
		{
			System.out.println(num+" is positive");
			if(num%2==0)
			{
				System.out.println(num+" is  even");
			}
			else
			{
				System.out.println(num+" is odd");
			}
		}
		else
		{
			System.out.println(num+" is  negative");
		}
	}
}

