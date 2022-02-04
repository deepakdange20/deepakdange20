package StringProgram;

public class ReverseWordFromString {
	
	public static void main(String[] args) 
	{
		String s ="Hello all Good day";
		String word[]=s.split(" "); //word[1]
		int j=0; 
		int l=word.length;
		String st="";
		int s1=0;
		while(j<l)
		{
			String wrd=word[j];
			String re="";
			for(int i=wrd.length()-1;i>=0;i--)
			{
				re = re+wrd.charAt(i);
			}
			st=st+re+" ";
			//re="";
			j++;
			
			//System.out.print(re);
		}
		
		
		System.out.print(st);
	}
	
	
	
}
