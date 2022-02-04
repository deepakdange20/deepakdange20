package StringProgram;

public class CharacterOccurencePresence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
CharacterOccurance("aaabbbccccc");
	}
	public static void CharacterOccurance(String input)
	{int i;
		
		for ( i = 0; i < input.length(); i++)
		{	
			int count=1;
			for (int j = i+1; j < input.length(); j++) {
				
			
				if(input.charAt(i)==input.charAt(j))
				{
					//System.out.println(input.charAt(i));
					count++;
				}
			}
			System.out.println(count);
		
		}

	}
}
