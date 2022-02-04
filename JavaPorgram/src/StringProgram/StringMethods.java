package StringProgram;

public class StringMethods {

	public static void main(String[] args) {
		String s1 = new String("Deepak");
		String s2= new String("Deepak");
		String s3="Dange";
		String s4= "Dange";
		String s5 ="deepak";
		String s6="   deepak   ";
		String s7="20-March-2021";

		System.out.println(s1.concat(s3));
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s1==s4);
		System.out.println(s2==s3);
		System.out.println(s2==s4);
		System.out.println(s3==s4);
		
		System.out.println(s1.charAt(0));
		System.out.println(s1.charAt(3));
		System.out.println(s1.indexOf('p'));
		System.out.println(s1.indexOf("eepak"));
		System.out.println(s1.lastIndexOf("eepak"));
		System.out.println(s1.substring(2));
		System.out.println(s1.substring(2, 5));
		System.out.println(s1.equalsIgnoreCase(s5));
		System.out.println(s6.trim());
		String s[]=s7.split("-");
		System.out.println(s[0]);
		System.out.println(s[1]);
		System.out.println(s[2]);
		System.out.println(s1.equals(s2));
		System.out.println(s3.equals(s4));
		
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		System.out.println(s1.replace('a', 'A'));
		System.out.println();
		char a[] =s1.toCharArray();
		System.out.println(a[1]);
		boolean b= s1.contains("eep");
		System.out.println(b);
		System.out.println(s1.isEmpty());
		System.out.println(s1.length());
	
		

	}

}
