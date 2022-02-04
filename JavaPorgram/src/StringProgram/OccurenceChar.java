package StringProgram;

public class OccurenceChar {
	
		public static void main(String[] args)
		{
		
			int count = charOccurance("Deepak", 'e');
			System.out.println("character repated "+ count);

		}

	public static int charOccurance(String s, Character c)
	{

	int count=0;
	boolean flag=true;

		for(int i=0;i<s.length();i++)

		{
			if(s.charAt(i)==c)
			{

				count++;
				
				flag=false;
			}
			
			

		}
			if(flag==true){

				System.out.println("character is not present");
			}
			else
			{
				System.out.println("character is present  " +c);
			}

			return count;
	}
}


