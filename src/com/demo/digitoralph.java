package com.demo;

class  digitoralph{
	public static void main(String args[]){
		char i=1;
		switch(i)
		{
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
		{
			System.out.println(" digit");
			break;
		}
		case'a' :
		case'b':
		case'c':
		{
			System.out.println("Alphabet");
			break;
		}
		case'@':
		case'$':
		{
			System.out.println("Special character"); break;
		}
		default:
			System.out.println(" Entered invalid symbol");
		}
	}
}

