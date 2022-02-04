package imp2.program;

import java.util.Scanner;

public class PalindromNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Number to be reverse:");
		String a =  sc.nextLine();
		int lenght = a.length();
		String reverse ="";
		for(int i=lenght-1; i>=0;i--)
		{
			reverse = reverse + a.charAt(i);
		}
		if(reverse.equals(a))
		{
			System.out.println("Number or string is polindrom");
		}
		else 
		{
			System.out.println("Number or string is not polindrom");
			
		}

			
	}

}
