package array.intprogram;

public class SumofAllElement {

	public static void main(String[] args) {
		int a[] = new int[]{10,20,30,30,10,50,10};
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		System.out.println(sum);
	}

}
