package imp2.program;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Number to be reverse:");
		int a =  sc.nextInt();
		
		int reverse = 0;
		int b=0;
		while(a!=0)
		{
		 b= a%10;
		 reverse = reverse*10+b;	
		 a=a/10;
		}
		System.out.println(reverse);
	}

}
