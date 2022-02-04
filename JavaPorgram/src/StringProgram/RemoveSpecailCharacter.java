package StringProgram;

public class RemoveSpecailCharacter {

	public static void main(String[] args) {
		String s="De@#eP$%ak";
		char[] ch=s.toCharArray();
		String cha="";
		for (int j = 0; j < ch.length; j++) 
		{
			if(Character.isLetterOrDigit(ch[j]))
			{
				cha= cha+ch[j];
			}
		}
		System.out.println(cha);
	//METHOD-2	
	String s1=	s.replaceAll("[^a-zA-Z0-9]", "");
	System.out.println(s1);
		
	}

}
