package imp2.program;

import java.util.Scanner;

public class ArmstrongNumberForloop {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num =  sc.nextInt();
		int digit =0;
		long sum = 0;
		int num2 = num;
		int num3=num;
		int digits=0;
	
		
		while(num2!=0)
		{	
			num2=num2/10;
			digits++;	
		}
		
		for(int i=1;i<=digits;i++)
		{
			digit = num % 10;
			//sum = sum + (digit*digit*digit);
			sum = sum + power(digit, digits);   
			num = num /10;
		}
		System.out.println(sum);
		
		if(sum == num3)
		{
			System.out.println("Number is Armstrong");
		}
		else
		{
			System.out.println("Number is not Armstrong");
		}
	}
	
	 static int power(int digit, int digits)
		{
		 int power=1;
		 for(int j=1;j<=digits;j++)
			{
				power = power*digit;
			}
		 return power;
		}
}
