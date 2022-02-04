package print.pattern;

public class Pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row=7;
		for(int i=1; i<=row; i++)
		{
			for(int j=row; j>i;j--)
			{
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++)
			{
				System.out.print("*");
				
			}
			System.out.println();
		}
	}

}
