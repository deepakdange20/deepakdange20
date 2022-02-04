package imp.program;

import java.util.Scanner;

public class PrintStringDescendingOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr the string:");
		String s = sc.nextLine();
		
		char[] a=s.toCharArray();
		
		
		 for (int i = a.length-1; i >=0; i--) {
	            for (int j = 0; j <= i; j++) {
	                System.out.print(a[j]);
	            }
	            System.out.println();
	        }
	}

}
