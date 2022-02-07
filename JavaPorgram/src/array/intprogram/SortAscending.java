package array.intprogram;

public class SortAscending {

	public static void main(String[] args) {
		
		int a[] = new int[]{85,525,85,74,4,9};
		int temp;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1; j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
								
				}
			}
		}
		
		for(int k=0;k<a.length;k++)
		{
			System.out.println(a[k]);
		}
		

	}

}
