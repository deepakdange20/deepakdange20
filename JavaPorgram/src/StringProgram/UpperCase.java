package StringProgram;

public class UpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="deePAk";
		char ch[]=s.toCharArray();
		String cha = "";
		for(int i=0;i<s.length();i++)
		{
			if(Character.isUpperCase(ch[i]))
			{
				cha=cha + ch[i];
			}
		}
		System.out.println(cha);
	}

}
