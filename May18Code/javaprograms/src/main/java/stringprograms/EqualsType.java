package stringprograms;

public class EqualsType {

	public static void main(String[] args) {
		
		String s1 ="Hello";
		String s2 = "Hello";
		System.out.println(s1.length());
		String s3 = new String("Hello");
	
		String r1 ="Raj";
		String r2="raj";
		
		System.out.println(r1.equals(r2));//
		System.out.println(r1.equalsIgnoreCase(r2));
		System.out.println("************");
	System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(r1.compareTo(r2));
		
		
		
		
		
		
		/*what is the difference between
		== and equals()
		
		==  address comparision
		equals() content comparision*/
		
	}

}
