package array.two_D.program;

public class ProductofMatrix {

	public static void main(String[] args) {
		int a[][] = new int[][] { { 1, 2, 3}, { 4, 5, 6}, { 7, 8, 9} };
		int b[][] = new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8,9 } };
		
		int rowa=a.length;
		int cola =a[0].length;
		
		int rowb=b.length;
		int colb=b[0].length;
		int c[][] = new int[rowa][colb];
		if(cola!=rowb)
		{
			System.out.println("Enter Valid col and rows for multipliaction");
		}
		else {
		for (int i = 0; i < rowa; i++) 
		{
			for (int j = 0; j < colb; j++) 
			{
				for(int k=0; k<rowb ;k++)
				{
					c[i][j]=c[i][j] + a[i][k]*b[k][j];
				}
			}
			
		}
		}	
		for(int i=0;i<rowa;i++)
		{
			for(int j=0;j<colb;j++)
			{
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
	}

}
