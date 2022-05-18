package stringprogramsmay10;

public class SplitWithWhiteSpaces {

	public static void main(String[] args) {
		String str ="money can buy happiness";
				String words1[] =str.split("\\s");
				
				for(String w : words1)
				{
					System.out.println(w);
				}
			
	}
}
