package StringProgram;

import java.util.Arrays;

public class RemoveDuplicateCharecter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="Deepakd";
		char[] ch1=s.toCharArray();
		String ch2="";
		
		for (int i = 0; i < ch1.length; i++)
		{
			boolean flag=false;
			for (int j = i+1; j < ch1.length; j++)
			{
				if(ch1[i]==ch1[j])
				{
					flag=true;
					break;
				}
			}
			if(flag==false)
			{
				ch2=ch2+ch1[i];
			}
			
		}
		System.out.println(ch2);
	}

}
