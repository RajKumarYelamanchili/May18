package stringprogramsmay10;

import java.util.Arrays;

public class AnagramEx {

	public static void main(String[] args) {
		String s1="Tina";
		String s2="Nabc";
		
		char[] s1CharArray = s1.toLowerCase().toCharArray();
		char[] s2CharArray =s2.toLowerCase().toCharArray();
		
		Arrays.sort(s1CharArray);
		System.out.println(s1CharArray);
		
		Arrays.sort(s2CharArray);
		System.out.println(s2CharArray);
		
	Boolean isEqual =Arrays.equals(s1CharArray, s2CharArray);
	 System.out.println("Both the strings are Anagram?" + isEqual);

	}

}
