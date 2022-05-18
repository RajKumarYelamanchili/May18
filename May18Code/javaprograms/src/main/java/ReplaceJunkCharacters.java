
public class ReplaceJunkCharacters {

	public static void main(String[] args) {
		String str="my &*(name %^&*is raj";
		//str =str.replaceAll("[^a-zA-Z0-9]","");
		//System.out.println(str);
		str =str.replaceAll("[^a-zA-Z0-9]\\s+"," ");
		System.out.println(str);
	}

}
