package imp2.program;

public class PrimeNumber extends Factorial {

	public static void main(String[] args) {
		int num= 10;
		int flag=0;
		if(num==1)
		{
			System.out.println("1 can not considered as prime or nonprime");
		}
		else {
		
		for (int i=2; i<num/2; i++)
		{
			if(num%i==0)
			{
				
				flag=1;
				break;
				
			}
			
		}
		if(flag==0)
		{
			System.out.println("prime number");
		}
		else 
		{
			System.out.println("not prime number");
		}
		}	
	}
}
