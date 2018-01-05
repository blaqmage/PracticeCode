package Solutions;

public class arrayReverse 
{
	public static void main(String[] args) 
	{
		String hi = "Hello world";
		String test = "badd";
		
		char [] c = test.toCharArray();
		char [] d = hi.toCharArray();
		
		int begin = 0;
		int end = c.length-1;
		char temp;
		
		while(begin < end) 
		{	
			temp = c[begin];
			c[begin] = c[end];
			c[end] = temp;
			begin++;
			end--;	 
		}
		System.out.print(new String(c));
	}
}
