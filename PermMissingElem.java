package Solutions;

import java.util.stream.IntStream;

public class PermMissingElem 
{
	public int solution(int[] Ary)
	{
		int N = Ary.length + 1;
		
        int total = N * (N + 1) / 2;

        for (int i : Ary) 
        {
            total -= i;
        }

        return total;
    }

	public int permCheck(int[] Ary)
	{
		int N = Ary.length;
		int sum = IntStream.of(Ary).sum();
		int total = N * (N + 1) / 2;
		
		if (sum == total) 
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	
	public int permCheckAlt(int[] Ary)
	{
		int[] counter = new int [Ary.length];
		 
        for(int i= 0; i< Ary.length; i++){
            if (Ary[i] < 1 || Ary[i] > Ary.length) {
                // Out of range
                return 0;
            }
            else if(counter[Ary[i]-1] == 1) {
                // met before
                return 0;
            }
            else {
                // first time meet
                counter[Ary[i]-1] = 1;
            }
        }
        return 1;
	}
	
	public static void main(String[] args) 
	{ 
		int[] ary = {4,3,5,1};
		PermMissingElem res = new PermMissingElem();
		//System.out.println(res.solution(ary));
		System.out.println(res.permCheckAlt(ary));
	}
}
