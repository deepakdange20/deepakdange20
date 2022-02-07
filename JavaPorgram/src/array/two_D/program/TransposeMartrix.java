package array.two_D.program;

public class TransposeMartrix {

	public static void main(String[] args) {
		int a[][] = new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int row = a.length;
		int col = a[0].length;
		int transpose[][]=new int[3][3];
		for (int i = 0; i < row; i++) 
		{
			for (int j = 0; j < col; j++) 
			{
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		for (int i = 0; i < row; i++) 
		{
			for (int j = 0; j < col; j++) 
			{
				transpose[j][i]=a[i][j];
			}
		}
		
		for (int i = 0; i < row; i++) 
		{
			for (int j = 0; j < col; j++) 
			{
				System.out.print(transpose[i][j]);
			}
			System.out.println();
		}
		System.out.println();

	}

}
