package Solutions;

public class TimeComplexity 
{
	public int frgJump(int x, int y, int d)
	{
		if (((y - x) % d) == 0) 
		{
		    return (y - x) / d;
		}
		return (y - x) / d + 1;
	}

	public static void main(String[] args) 
	{
		TimeComplexity res = new TimeComplexity();
		int[]ary = {10, 85, 30};
		int result = res.frgJump(ary[0], ary[1], ary[2]);
		System.out.println(result);
		

	}

}
