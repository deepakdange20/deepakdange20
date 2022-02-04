package print.pattern;

public class HelloRhombas {

	public static void main(String[] args) {
		int n=5;
		int m= 6;
		for(int i=1; i<=m; i++)
		{
			
			for(int k=1; k<i; k++)
			{
				
				System.out.print(" ");
			}
			for(int j=1; j<=n;j++)
			{
				if(i==1 || i==m || j==1 || j==n) {
				System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			
			System.out.println();
		}


	}

}
