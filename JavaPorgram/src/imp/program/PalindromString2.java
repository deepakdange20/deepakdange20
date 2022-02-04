package imp.program;

public class PalindromString2 {
	public static void main(String[] args)
	{
		String s= "DeepakkapeeD";
		String reverse="";
		int l= s.length();
		System.out.println(l);
				
		for(int i=l-1; i>=0; i--)
		{
		
			reverse = reverse + s.charAt(i);
			
		}
		System.out.println(reverse);
		if (s.equals(reverse))
		{
			System.out.println("This is polindrom string");
		}
		else
		{
			System.out.println("This is not polindrom string");
		}
	}
}
