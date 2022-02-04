package imp2.program;

import java.io.PrintStream;
import java.util.Scanner;



public class Factorial {
 
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr number to be factorial :");
		int a =  sc.nextInt();
		long fact=1;
		for(int i=1; i<=a; i++)
		{
			fact = fact*i;
		}
		System.out.println("Factorial is :" +fact);
	}

}
