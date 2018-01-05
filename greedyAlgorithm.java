package Solutions;

public class greedyAlgorithm 
{
	public int tieRopes(int k, int[] Ary)
	{
		int result = 0;
		int length = 0;
		
		for (int rope : Ary) 
		{
			length += rope;
			
			if (length >= k) 
			{
				result++;
				length = 0;
			}
		}
		return result;
	}

	public static void main(String[] args) 
	{
		greedyAlgorithm res = new greedyAlgorithm();
		int[] ary = {3,4,1,2,1,1,3};
		int k = 4;
		System.out.println(res.tieRopes(k, ary));
		// TODO Auto-generated method stub

	}

}
