package differentstring;

 class StringBufferBuilder {

	 public static void concat1(String s1)
	 {
		s1 = s1 + "Kumar";
		 
	 }
	 
	 public static void concat2(StringBuffer s2)
	 {
		s2.append("Kumar");
	 }
	 
	 public static void concat3(StringBuilder s3)
	 {
		s3.append("Kumar");
	 }
	 
	 
	 
	public static void main(String[] args) {
		
		String s1 = "Raj";
		concat1(s1);
		System.out.println("String is " + s1);
		
		
		StringBuffer s2 = new StringBuffer("Raj");
		concat2(s2);
		System.out.println("StringBuffer is " + s2);
		
		StringBuilder s3 = new StringBuilder("Raj");
		concat3(s3);
		System.out.println("StringBuilder is " + s3);
		
	}

}
