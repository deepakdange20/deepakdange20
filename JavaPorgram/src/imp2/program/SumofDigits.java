package imp2.program;

import java.util.Scanner;

public class SumofDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Sum of digit from number:");
		int a =  sc.nextInt();
		int b = 0,c=0;
		while(a!=0)
		{
			b=b+a%10;
		    //c=b+c;
			a=a/10;
		}
		System.out.println(b);
	}

}
