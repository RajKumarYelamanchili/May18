package stringprograms;

public class StringLength {

	public static void main(String[] args) {
		String s1 ="My name is Rohan";
		char[] ch = s1.toCharArray();
		//System.out.println(ch.length);
	 int count =0;
		
	 for (char t : ch)
	 {
		 //System.out.println(s);
		 count++;
	 }
	 System.out.println(count);
	}

}
