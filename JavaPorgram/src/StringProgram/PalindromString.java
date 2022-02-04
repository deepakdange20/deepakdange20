package StringProgram;

public class PalindromString {

	public static void main(String[] args) {
	
		String s="Mam";
		int start=0;
		int end=s.length()-1;
		s=s.toLowerCase();
		int i;
		for( i=0;i<s.length()/2;i++)
		{
			if(s.charAt(start)==s.charAt(end))
			{
				start++;
				end--;
	
			}
		}
		
		if(i==start)
		{
			System.out.println("String is palindrom");
		}
		else
		{
			System.out.println("String is not polindrom");
		}
	}

}
