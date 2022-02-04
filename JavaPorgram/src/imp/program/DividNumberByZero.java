package imp.program;

public class DividNumberByZero {

	public static void main(String[] args) {
		//integer gives arithmatic exception
		//double, float gives infinity
		
		System.out.println(9.0/0);//infinity
		System.out.println(9.0/0.0);//infinity
		System.out.println(9.045f/0);//infinity
		System.out.println(945.02445d/0);//infinfity
		System.out.println(0.0/0.0);//nan
		System.out.println(0.0/0);//nan
		System.out.println(9/0);//arithmaticException
	}

}
