package print.pattern;

public class PrintAsciiValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ascii=33;
		for(int i=0;i<= 126; i++)
		{
			System.out.println((char) (ascii+i)+"- "+ (33+i));
			
		}
	}

}
