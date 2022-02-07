package array.intprogram;

public class SmallestNumber {

	public static void main(String[] args) {
		int a[]= new int[] {10,5,6,4,8,4};
		int min = a[0]; 
		
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
			//System.out.println(min);
		}
		System.out.println(min);
	}

}
