package imp2.program;

import java.util.Scanner;

public class Calaculator {

	public static void main(String[] args) {
		String d = "yes";
		int result = 0;
		
		while(d.equals("yes")) 
		{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two Numbers: ");
		int num1= sc.nextInt();
		int num2 =sc.nextInt();
		
		System.out.println("Enter oprator +,-,*,/");
		char oprator = sc.next().charAt(0);//+,-,/,*
		
		switch (oprator) {
		case '+':
			result= num1+num2;
			break;
		case '-':
			result= num1-num2;
			break;
		case '*':
			result= num1*num2;
			break;
		case '/':
			result= num1/num2;
			break;
		default:
			System.out.println("Enter Correct oprator....");
			break;
	
	}
		System.out.println(result);
		System.out.println("Do you want to contni:");
		d=sc.next();
		
		}
	}

}
