package array.two_D.program;

public class Add_and_Sub {

	public static void main(String[] args) {
		
			int a[][] = new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
			int b[][] = new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
			int rowa = a.length;
			int cola = a[0].length;
			int rowb =b.length;
			int colb =b[0].length;
			int add[][]=new int[rowa][colb];
			int sub[][] =new int [rowa][colb];
			for (int i = 0; i < rowa; i++) 
			{
				for (int j = 0; j < colb; j++) 
				{
					//add[i][j]=a[i][j]+b[i][j];
					sub[i][j]=a[i][j]-b[i][j];
				}
				//System.out.println();
			}
			for (int i = 0; i < rowa; i++) 
			{
				for (int j = 0; j < colb; j++) 
				{
					//System.out.print(add[i][j]+" ");
					System.out.print(sub[i][j]+" ");
				}
				System.out.println();
			}
	}

}
