package imp2.program;

public class WhileLoop {

	public static void main(String[] args) {
		int num=5869;
		int a=0;
		int b=0;
		int d=0;
		while(num!=0)//0=0
		{	
			b= num%10;
			if(b%2==0)
			{
				System.out.println("even digits:"+b);
				a++;
			}
			else
			{
				System.out.println("odd digits:"+b);
				d++;
			}
			num=num/10;//4585/10=458  458/10=45 45/10=4 4/10=0
			
		}
		
	   //System.out.println("count of odd digits:"+d);
		//System.out.println("count of even digits:"+a);
		
	}

}
