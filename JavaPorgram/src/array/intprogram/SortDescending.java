package array.intprogram;

public class SortDescending {

	public static void main(String[] args) {
		int []a={54,10,63,85,45};
		int temp;
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j]) //54<10, 54<63
				{
					temp=a[i]; //temp=54
					a[i]=a[j]; //a[0]=63
					a[j]=temp;	//a[2]=54		
				}
			}
		}
		
		for(int k=0;k<a.length;k++)
		{
			System.out.print(a[k]+" ");
		}
	}

}
