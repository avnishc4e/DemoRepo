package collections;

public class StringImmutability {

	public static void main(String[] args) {

		
		String s1="abc";
		String s2="xyz";
	    s1.concat("123");
		System.out.println(s1);
		s2=s2.concat("123");
		System.out.println(s2);
	
		
	}

}
