package Solutions;

import java.util.Arrays;

public class sorting 
{
	public int distinct(int[] Ary)
	{
		int count = 1;
		
		if (Ary.length == 0) 
		{
		    return 0;
		}

		if (Ary.length == 1) 
		{
		    return 1;
		}
		
		Arrays.sort(Ary);

		for (int i = 0; i < Ary.length - 1; i++) 
		{
		    if (Ary[i] != Ary[i + 1]) 
		    {
		        count++;
		    }
		}

		return count;
	}
	
	public static boolean checkForUnique(String str)
	{
	    boolean containsUnique = false;

	    for(char c : str.toCharArray())
	    {
	        if(str.indexOf(c) == str.lastIndexOf(c))
	        {
	            containsUnique = true;
	        } 
	        else 
	        {
	            containsUnique = false;
	            break;
	        }
	    }

	    return containsUnique;
	}
	
	public static void main(String[] args) 
	{
		//sorting res = new sorting();
		//int[] ary = {2,1,1,2,3,1,3,2,6};
		//System.out.println(res.distinct(ary));
		String test = "Dermatoglyphics";
		System.out.print(checkForUnique(test));
	}

}
