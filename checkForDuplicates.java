package Solutions;

public class checkForDuplicates {

	public static void main(String[] args) 
	{
		String teString = "abbcccddeeffggii";
		String newString = null;
		char []c = teString.toCharArray();
		for (char d: c)
		{
			if (newString == null) 
			{
				newString = String.valueOf(d);
				continue;
			}
			if(newString.indexOf(d) == -1)
			{
				newString = newString.concat(String.valueOf(d));
			}
		}
		System.out.print(newString);
	}

}
