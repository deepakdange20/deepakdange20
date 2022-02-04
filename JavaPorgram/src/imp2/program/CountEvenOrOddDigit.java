package imp2.program;

import java.util.Scanner;

public class CountEvenOrOddDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:");
		int a =  sc.nextInt();
		int b=0;
		int even=0;
		int odd=0;
		while(a!=0)
		{
			b=a%10;
			if(b%2==0)
			{
				even++;
			}
			else
			{
				odd++;
			}
			a=a/10;
		}
		System.out.println("Number of Even Digit:"+even);
		System.out.println("Number of Odd Digit:"+odd);
	}

}
