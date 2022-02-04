package imp2.program;

public class LcmAndHcf {

	
	public static void main(String[] args) {

		int x=45;
		int y=15;
		int lcm;
		lcm=(x*y)/Hcf(x,y);
		System.out.println("HCF or GCD is:"+Hcf(x,y));
		System.out.println("LCM is:"+lcm);

	}
	
	public static int Hcf(int a, int b)
	{
		int hcf = 0;
		for(int i=1; i<=a||i<=b;i++)
		{
			if(a%i==0 && b%i==0)
			{
				hcf=i;
			}
		}
		return hcf;
	}

}
