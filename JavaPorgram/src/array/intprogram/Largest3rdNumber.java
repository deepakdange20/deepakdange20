package array.intprogram;

public class Largest3rdNumber {

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
		
		System.out.println();
		System.out.println("3rd Largest no is="+a[2]);
		System.out.print("2nd Largest no is="+a[1]);
		System.out.print("Largest no is="+a[0]);
	}

}
