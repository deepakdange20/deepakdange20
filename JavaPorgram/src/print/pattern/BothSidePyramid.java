package print.pattern;

public class BothSidePyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row =5;
		for(int i=0; i<row; i++)
		{
			for(int k=row; k>i; k--)
			{
				System.out.print(" ");
				
			}
			for(int j=0; j<=i;j++)
			{
				
				System.out.print("* ");
			}
			
			System.out.println();
		}
		for(int i=0; i<row; i++)
		{
			
			for(int k=0; k<i+1; k++)
			{
			 System.out.print(" ");
			}
			for(int j =row-1; j>i; j--)
			{
				System.out.print(" *");
			}
			System.out.println();
		}
	}

}
