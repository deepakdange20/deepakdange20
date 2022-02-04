package print.pattern;

public class RhombasPattern {

	public static void main(String[] args) {
	int n=5;
	int m= 10;
	for(int i=1; i<m; i++)
	{
		for(int k=1; k<i; k++)
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
