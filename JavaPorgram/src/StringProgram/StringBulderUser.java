package StringProgram;

public class StringBulderUser {

	public static void main(String[] args) {
		StringBuilder sb1 = new StringBuilder("Deepak");
		StringBuilder sb2 = new StringBuilder("Deepak");   
		
		System.out.println(sb1==sb2);
		System.out.println(sb1.equals(sb2));
		System.out.println(sb1.capacity());
		System.out.println(sb1.indexOf("e"));
		System.out.println(sb1.codePointAt(3));
		System.out.println(sb1.indexOf("e", 2));
	//	System.out.println(sb1.isEmpty());
		System.out.println(sb1.length());
		System.out.println(sb1.substring(2));
		System.out.println(sb1.lastIndexOf("pak"));
		System.out.println(sb1.delete(2, 4));
		
		sb1.append(sb2);
		System.out.println(sb1);
		
	}

}
