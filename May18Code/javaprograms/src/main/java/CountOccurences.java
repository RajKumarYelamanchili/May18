
public class CountOccurences {
	
	public static void main(String[] args) {
		 
        String inputString = "she sells sea shells on the sea shore";
 
        char ch = 's';
 
        int count = 0;
 
        for (int i = 0; i < inputString.length(); i++) {
 
            if (inputString.charAt(i) == ch) {
                count++;
            }
        }
 
        System.out.println("Total number of characters " + count);
    }
 
}


