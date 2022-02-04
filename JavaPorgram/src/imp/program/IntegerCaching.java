package imp.program;

public class IntegerCaching {

	public static void main(String[] args) {
		// campare two numbersin integer caching
		//integer cache range is between -128 to 127. it gives true only in above
		//menetion range number otherwise flase
		//bz we are camparing referances of object
		
		Integer num1=200;
		Integer num2 =200;
		if(num1==num2)
		{
			System.out.println("Both are equal");
		}
		else
		{
			System.out.println("Both are not equal");
		}
		
		
	}

}
