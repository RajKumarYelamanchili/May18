package stringprogramsmay10;

public class CountOccurences {

	public static void main(String[] args) {
		String str = "she sells sea shells on the sea shore";
		char s = 's';
		
		int count = 0;
		
		for(int i =0; i<str.length();i++)
		{
			if (str.charAt(i) == s)
			{
				count++;
				System.out.println(str.charAt(i));
			}
			
		}
		System.out.println("Total number of times " + s + "is repeating = " + count );
	}

}
