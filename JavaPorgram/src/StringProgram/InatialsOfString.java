package StringProgram;

import java.util.Scanner;

public class InatialsOfString {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String s = sc.nextLine();
		String spl[] = s.split(" ");
		System.out.println(spl.length);
		for(int i=0; i<spl.length;i++)
		{
			//System.out.println(spl[i]);
			System.out.println(spl[i].charAt(0));
		}
		
		
		

	}

}
