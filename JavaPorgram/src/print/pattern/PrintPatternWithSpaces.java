package print.pattern;

import java.util.Scanner;

public class PrintPatternWithSpaces {

	public static void main(String[] args) {

		int row =15;
		
		for(int i=0; i<row; i++)
		{
			for(int j=row; j>i; j--)
			{
				System.out.print(" ");
				
			}
			for(int j=0; j<=i;j++)
			{
				
				System.out.print("* ");
			}
			
			System.out.println();
		}

	}

}
