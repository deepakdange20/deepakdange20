package StringProgram;

public class PalindaromWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean a = palindrom("Madam");
		
		if(a==true)
		{
			System.out.println("String is palindrom");
		}
		else
		{
			System.out.println("String is not palindrom");
		}
	}
	
	public static boolean palindrom(String str)
	{
		int i=0,j=str.length()-1;
		str=str.toLowerCase();
		
		while(i<j)
		{
			if(str.charAt(i)!=str.charAt(j))
			{
				return false;	
			}
			i++;
			j--;
			
		}
		return true;
	}

}
