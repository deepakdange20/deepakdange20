package StringProgram;

import java.util.Scanner;

public class OccuranceofCharecter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String s = sc.nextLine();
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='t')
			{
				count++;
			}
		}
		System.out.println(count);
	}

}
