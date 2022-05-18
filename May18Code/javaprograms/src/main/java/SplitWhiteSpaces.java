
public class SplitWhiteSpaces {

	public static void main(String[] args) {
		String str ="rome was not built in a day";
		String words[] = str.split("\\s");
		for(String w: words)
		{
			System.out.println(w);
		}
		

	}

}
