package stringprogramsmay10;

import java.util.StringTokenizer;

public class StringTokenEx
{
	public static void main(String args[])
	{
	StringTokenizer st = new StringTokenizer("my name is raj"," ");
	
	while(st.hasMoreTokens())
	{
		System.out.println(st.nextToken());
	}
	
	}

}
