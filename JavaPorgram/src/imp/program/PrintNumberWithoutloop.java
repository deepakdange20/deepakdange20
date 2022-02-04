package imp.program;

public class PrintNumberWithoutloop {
	
	public static void main(String[] args)
	{
		printNum(10, 50);
		//printNum(1);
	}
	
	//using recursive function
	public static void printNum(int num)
	{
		if(num<=100)
		{
			System.out.println(num);
			num++;
			printNum(num);
			
		}
	}
	
	//making generic function 
	public static void printNum(int startnum, int endnum)
	{
		if(startnum<=endnum)
		{
			System.out.println(startnum);
			startnum++;
			printNum(startnum, endnum);
			
		}
	}
}
