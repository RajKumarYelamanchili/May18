package stringprograms;

public class StringBufferBuilder {

	public static void concat1(String s1)
	{
		s1 = s1 + "Kumar";//RajKumar
	}
	
	public static void concat2(StringBuilder s2)
	{
		s2.append("Kumar"); //RajKumar
	}
	public static void concat3(StringBuffer s3)
	{
		s3.append("Kumar");
	}
	
	public static void main(String[] args) {
	String s1 = "Raj";
	concat1(s1);
	System.out.println("string is : " + s1);
	
	StringBuilder s2 = new StringBuilder("Raj");
	concat2(s2);
	System.out.println("StringBuilder is : " + s2);
	
	StringBuffer s3  = new StringBuffer("Raj");
	concat3(s3);
	System.out.println("StringBuffer is : " +s3);

	}

}
