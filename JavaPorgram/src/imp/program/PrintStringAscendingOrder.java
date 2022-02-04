package imp.program;

import java.util.Scanner;

public class PrintStringAscendingOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr the string:");
		String s = sc.nextLine();
	
		char[] a=s.toCharArray();
		sc.close();		
		
		for(int i=0; i<=a.length-1;i++)
		{
			for(int k=a.length; k>i;k--)
			{
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++)
			{
				System.out.print(" "+a[j]);
			}
			   System.out.println();
		}
		
		
		
	}

}
