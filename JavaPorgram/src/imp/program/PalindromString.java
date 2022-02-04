package imp.program;

public class PalindromString {

	public static void main(String[] args) {
		String s = "madam";
		int begin=0;
		int end = s.length()-1;
		int middle = (begin + end)/2;
		System.out.println(middle);
		int i;
		
		for( i = begin; i<= middle; i++ )
		{
			if(s.charAt(begin)==s.charAt(end))
			{	
				begin++;
				end--;
			}
			
		}
		if (i == begin)
		{
		System.out.println("This is polindron string");
		}
		else
		{
			System.out.println("This is not polindron string");
		}
			
	}

}
