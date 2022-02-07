package array.intprogram;

public class DulpicateElement {

	public static void main(String[] args) {
		int a[] = new int[]{10,20,10,30,50};
		boolean flag=false;
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=i+1;j<a.length-1;j++)
			{
				if(a[i]==a[j])
				{
					System.out.println("Duplicate numbers are"+a[j]);
					flag=true;
				}
			}
		}
		if(flag==false)
		{
			System.out.println("Thre are no duplicate number is Arry");
		}
	}

}
