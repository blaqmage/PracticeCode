package Solutions;

public class solution$2 
{
	public static int[] solution(int[] Ary, int R) 
	{	
		int [] tmp = new int[R];
		
		for (int i = 0; i < R; i++) 
			tmp[i] = Ary[i];
		
        for (int i = 0; i < Ary.length-R; i++)
        {
            Ary[i] = Ary[i + R];
        }
        
        int pos = Ary.length - R;
        for (int i = 0; i < R; i++) 
        {
			Ary[pos] = tmp[i];
			++pos;
		}
				
		return Ary;
    }
	
	public static void main(String[] args) 
	{
		int [] ary = {3,8,9,7,6};
		int [] result = solution(ary, 3);
		for (int i : result) 
		{
			System.out.print(i+",");
		}
	}
}
