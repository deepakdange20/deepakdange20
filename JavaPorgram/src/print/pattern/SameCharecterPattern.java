package print.pattern;

public class SameCharecterPattern {

	public static void main(String[] args) {
		int row=5;
		int ascii=65; //small letter a ascii=97
		/*
		 * for(int i=0; i<row; i++) { for(int j=0;j<=i; j++) { System.out.print((char)
		 * (ascii)); } ascii++; System.out.println(); }
		 */
		for(int i=0; i<row; i++)
		{	
			for(int j=0;j<=i; j++)
			{
				System.out.print((char) (ascii+i));
			}
			
			System.out.println();
		}
	}

}
