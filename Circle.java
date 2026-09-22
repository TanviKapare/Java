package basicJavaPrograms;

import java.util.Scanner;

public class Circle {

	public static void main(String[] args) {
		//float pi=3.14f;
		double area;
		double peri;
		float r;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Radius of circle= ");
		r=sc.nextFloat();
		
		area= Math.PI*(r*r);
		System.out.println("Area of circle= " +area);
		
		peri=2*Math.PI*r;
		System.out.println("Perimeter of circle= " +peri);
		sc.close();

	}

}
