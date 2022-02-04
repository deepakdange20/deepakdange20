package string.strinbuffer.stringbulder;

public class ImmutabelString {

	public static void main(String[] args) {
		
		//String and stringbuffer comparsion 
		//1. string - immutable StringBuffer mutable
		//Example - explain below
		String s = new String("Deepak");
		s.concat("Dange");// can not any make changes once object created
		System.out.println(s);
		//once object is created  we can not perform any changes on that object 
		//this concept is called immutable so string is immutable in nature 
		//or we try to perform any changes new object is created if its not referfed by any 
		//reference then it is collected by garbage collector
		
		System.out.println("......................");
		StringBuffer sb=  new StringBuffer("Devansh");
		sb.append(" Dange");// can create changes once object created 
		System.out.println(sb);
		
		//2. string == and equals method gives referance and content comparion respectivly- use own method from 
		//string class overriden from parent object class
		//StringBuffer both gives referance comparison- use object parent class method
		//exmpale explain in interview
		 
		System.out.println(".....................");
		String s1= new String("Deepak");
		String s2 = new String ("Deepak");
		 System.out.println(s1==s2);//false 
		 System.out.println(s1.equals(s2));//true String class overriden method content comparion
		 
		 System.out.println(".....................");
		 StringBuffer sb1 = new StringBuffer("Deepak");
		 StringBuffer sb2 = new StringBuffer("Deepak");
		 System.out.println(sb1==sb2);//false
		 System.out.println(sb1.equals(sb2));//false object class method refrance comparion
		 
	}

}
