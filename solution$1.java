package Solutions;

public class solution$1 
{

	public static boolean isUniqueChars2(String str) 

	{
		boolean[] char_set = new boolean[256];
		
		for (int i = 0; i < str.length(); i++) 
    		{
				int val = str.charAt(i);
				if (char_set[val]) 
				{
					return false;
				}
				char_set[val] = true;
    		}
			return true;
	}
	
	
	
	public static void main(String[] args) 
	{
		//boolean result1 = isUniqueChars2("aassfdsg");
		//System.out.println(result1);
		
		int [][] test = {{2,4},{1,3}};
		int res = test.length;
		for (int layer = 0; layer < res/2; layer++) 
		{
			int first = layer;
			int last = res - 1 - layer;
			
			for (int i = first; i < last; i++) 
			{
				int offset = i - first;
				int top = test[first][i]; //Save top
				//Left --> top
				test[first][i] = test[last-offset][first];
				
				// bottom -> left
				test[last-offset][first] = test[last][last - offset];
				
				// right -> bottom
				test[last][last - offset] = test[i][last];
				
				// top -> right
				test[i][last] = top; // right <- saved top
			}
		}
		
		for (int i = 0; i < 2; i++) 
		{
			for (int j = 0; j < 2; j++) 
			{
				System.out.print(test[i][j] + " ");
			}
		}
	}

}
