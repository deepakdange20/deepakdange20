package print.pattern;

public class PrintCharecterPattern {

	public static void main(String[] args) {
		int row=5;
		int ascii=65;
		
		for(int i=0; i<=row ;i++)
		{
			for(int j=0; j<=i; j++)
			{
				System.out.print((char) (ascii+j));
			}
			System.out.println();
		}

	}

}
