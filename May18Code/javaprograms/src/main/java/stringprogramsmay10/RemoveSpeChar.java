package stringprogramsmay10;

class RemoveSpeChar {

	public static void main(String[] args) {
		String str = "rome&*(was!@#$not built&*(in a day";
		
		String str1 = str.replaceAll("[^a-zA-Z0-9]","");
		System.out.println(str1);
		
		
	}

}
