package imp2.program;

import java.util.Scanner;

public class Swap2Number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr two numbers:");
		int a =  sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println("Entred two numbers are :" +a+" "+b);
		//using three variables
		int temp = a;
		a=b;
		b=temp;
		
		System.out.println("numbers after swapping are :" +a+" "+b);
		
		// using two varible + and - 
		
		a=a+b; //20+30=50
		b=a-b;  //50-30=20
		a=a-b; //50-20=30
				
		System.out.println("numbers after swapping are :" +a+" "+b);
		 
		//using 2 vairable * and / but number should not be 0
		try {
			a=a*b; //2*3=6
			b=a/b;  //6/3=2
			a=a/b; //6/2=3
			System.out.println("numbers after swapping are :" +a+" "+b);
		} catch (ArithmeticException e) {
			e.printStackTrace();;
		}
	}

}
