package StringProgram;

public class OccuranceOfCharacter {

	public static void main(String[] args) {
		
		CharacterOccurance("Deepakeee", 'e');
	}

	public static void CharacterOccurance(String input , char ch)
	{
		int count=0;
		for (int i = 0; i < input.length(); i++)
		{
				if(input.charAt(i)==ch)
				{
					//System.out.println(input.charAt(i));
					count++;
				}
			
		}
		System.out.println(ch+" "+count);
	}
}
