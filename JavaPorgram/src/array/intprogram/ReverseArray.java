package array.intprogram;

public class ReverseArray {
	static
	{
		System.out.println("hi");
	}
	
	public static void main(String[] args) {
		int a[] = {10,20,5,8,3,52,58,65};// {65,58,52,5,3,8,20,10}
		int temp=0;
		for(int i=0;i<a.length/2;i++) //1
		{
			temp=a[i];  //temp=10,temp=20,temp=5,temp=8
			a[i]=a[a.length-i-1]; //a[0]=65	,a[1]=58,a[2]=52,a[3]=3
			a[a.length-i-1]=temp; //a[7]=10,a[6]=20,a[5]=5,a[4]=8
			//System.out.println(a[i]);	
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);				
		}
		

	}

}
