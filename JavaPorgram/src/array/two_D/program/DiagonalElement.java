package array.two_D.program;

public class DiagonalElement {

	public static void main(String[] args) {
		int a[][]=new int[][] {
			{1,2,3},
			{4,5,6},
			{7,8,9}
			};
		int row =a.length;
		int col =a[0].length;
		
		
				for(int i=0;i<row;i++)
				{
					for(int j=0;j<col;j++)
					{
						if(i!=j)
						{
							a[i][j]=0;
						}
						
					}
					
				}
				for(int i=0;i<row;i++)
				{
					for(int j=0;j<col;j++)
					{
						System.out.print(a[i][j]);
					}
					System.out.println();
				}

	}

}
