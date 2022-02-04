package imp.program;

public class ReverseString {
	public static void main(String[] args)
	{
		String s= "Deepak";
		String reverse="";
		int l= s.length();
		System.out.println(l);
				
		for(int i=l-1; i>=0; i--)
		{
		
		reverse = reverse + s.charAt(i);
			
		}
		System.out.println(reverse);
	}
}
