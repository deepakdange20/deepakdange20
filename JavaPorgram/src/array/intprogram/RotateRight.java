package array.intprogram;

public class RotateRight {

	public static void main(String[] args) {
		int a[] = {1,2,3,4,5,6,7};
		int temp;
		
		for(int j=0;j<6;j++)
		{
			temp=a[a.length-1];
			for(int i=a.length-1; i>0;i--)
			{
				a[i]=a[i-1];
			}
			a[0]=temp;
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		

	}

}
