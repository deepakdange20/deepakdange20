package print.pattern;

public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row=5;
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
		for(int i=1; i<=row; i++)
		{
			for(int d=1; d<=i; d++)
			{
				System.out.print(" ");
			}
			for(int c=row-1; c>=i; c--)
			{
				System.out.print("*");
			}
		System.out.println();
		}
		
		
	}

}
