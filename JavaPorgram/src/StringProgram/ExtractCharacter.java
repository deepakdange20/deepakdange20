package StringProgram;

import java.util.Scanner;

public class ExtractCharacter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String s = sc.nextLine();
		int a=0;
		int b=0;
		int c=0;
		char ch[] =s.toCharArray();
		int l=ch.length;
		for(int i=0;i<l;i++)
		{
			if(Character.isAlphabetic(ch[i]))
			{
				System.out.print(ch[i]);
				a++;
			}
			 else if(Character.isDigit(ch[i]))
			{
				System.out.print(ch[i]);
				b++;
			}
			else
			{
				 System.out.print(ch[i]);
				 c++;
			}					
		}
		
		System.out.println("Alphabate: "+a+" Digit: "+b+" Specail Character: "+c);

	}

}
