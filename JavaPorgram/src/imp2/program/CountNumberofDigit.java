package imp2.program;

import java.util.Scanner;

public class CountNumberofDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Count digit from number:");
		int a =  sc.nextInt();
		int count=0;
		while(a!=0)
		{
		
		 a=a/10;
		 count++;
		}
		System.out.println(count);
	}

}
