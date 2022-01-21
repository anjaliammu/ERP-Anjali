package sample;

import java.util.Scanner;

public class inputfromconsole {

	private static Scanner input;

	public static void main(String[] args)
	{
	int a,b,sum;
	input = new Scanner(System.in);
	System.out.println("Enter A: ");
	a= input.nextInt();
	System.out.println("Enter B:  ");
	b= input.nextInt();
	 sum = a+b;
	
	System.out.println("Sum of a+b is  "+ sum);

	}

}
