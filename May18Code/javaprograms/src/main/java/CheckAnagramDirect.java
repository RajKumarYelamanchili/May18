import java.util.Arrays;

public class CheckAnagramDirect {

		 
		 public static void main(String[] args) {
		 String firstString = "Tina";
		 String secondString = "Nita1";
		 
		 
		        char[] firstStringCharArray = firstString.toLowerCase().toCharArray();
		        char[] secondStringCharArray = secondString.toLowerCase().toCharArray();       
		        Arrays.sort(firstStringCharArray);
		        Arrays.sort(secondStringCharArray);
		       
		  Boolean isEqual = Arrays.equals(firstStringCharArray, secondStringCharArray);
		  System.out.println(isEqual);
		        
		    }

}
