import java.util.StringTokenizer;

public class StringTokenExample {
	 public static void main(String args[]){  
		   StringTokenizer st = new StringTokenizer("my name is Raj"," ");  
		     while (st.hasMoreTokens()) {  
		         System.out.println(st.nextToken());  
		     }  
		   }  

}
