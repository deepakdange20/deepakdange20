package array.two_D.program;

public class EvenAndOdd {

	public static void main(String[] args) {
		int a[][]=new int[][] {
			{1,2,3},
			{4,5,6},
			{7,8,9}
			};
		int row =a.length;
		int col =a[0].length;
	
		int even=0;
		int odd=0;
		int k=0;
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				if(a[i][j]%2==0)
				{
					System.out.println("Even "+a[i][j]);
					even++;
				}
				else
				{
					System.out.println("Odd "+a[i][j]);
					odd++;
				}
				
			}
			
		}
		
		System.out.println("Even Element="+even);
		System.out.println("Odd Element="+odd);

	}

}
