package Solutions;

public class prefixSums 
{
	public int countDiv(int A, int B, int K)
	{
		if (B <= K) 
		{
			return 1;
		}
		
		int num1 = A/K;
		
		if (A%K != 0) 
		{
			num1++;
		}
		
		int num2 = B/K;
		
		return (num2 - num1) + 1;
	}

	public static void main(String[] args) 
	{
		prefixSums res = new prefixSums();
		System.out.println(res.countDiv(6, 12, 3));
	}

}
