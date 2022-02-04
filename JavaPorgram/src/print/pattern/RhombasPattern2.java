package print.pattern;

public class RhombasPattern2 {

	public static void main(String[] args) {
		int n=4;
		int m= 7;
		for(int i=1; i<m; i++)
		{
			for(int k=m-1; k>i; k--)
			{
				System.out.print(" ");
			}
			for(int j=1; j<n;j++)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}


	}

}
