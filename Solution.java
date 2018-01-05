package Solutions;

class Solution 
{	
    public int solution(int[] Ary)
    {
    	int unpaired = 0;
    	for (int number : Ary) 
    	{
			unpaired = unpaired ^ number;
		}
		return unpaired;
    }
    
    public static void main(String [] args) 
    {
		Solution res = new Solution();
		int[] ary = {9, 3, 9, 3, 9, 6, 9};
		int result = res.solution(ary);
		System.out.println("Result#1 = " + result);
	}
}