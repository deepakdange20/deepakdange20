package StringProgram;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter the String wanted to be reversed:");
		String s=sc.nextLine();
		String reverse="";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			reverse = reverse+s.charAt(i);
		}
		
		System.out.println(reverse);

	}
}
