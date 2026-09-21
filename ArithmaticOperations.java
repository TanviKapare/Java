package basicJavaPrograms;

import java.util.Scanner;

public class ArithmaticOperations {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("First number= ");
		int num1=sc.nextInt();
		
		System.out.println("Second number= ");
		int num2=sc.nextInt();
		
		System.out.println("Addition of two numbers= "+(num1+num2));
		System.out.println("Subtraction of two numbers= "+(num1-num2));
		System.out.println("Multiplication of two numbers= "+(num1*num2));
		System.out.println("Division of two numbers= "+(num1/num2));
		System.out.println("Reminder of two numbers= "+(num1%num2));
		
		sc.close();
	}

}
