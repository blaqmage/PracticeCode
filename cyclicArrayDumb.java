package Solutions;

public class cyclicArrayDumb 
{
	public int[] rotate(int[] nums, int k) 
	{
	    if(k > nums.length) 
	        k=k%nums.length;
	 
	    int[] result = new int[nums.length];
	 
	    for(int i=0; i < k; i++)
	    {
	        result[i] = nums[nums.length-k+i];
	    }
	 
	    int j=0;
	    for(int i=k; i<nums.length; i++)
	    {
	        result[i] = nums[j];
	        j++;
	    }
	 
	    System.arraycopy( result, 0, nums, 0, nums.length );
	    return nums;
	}
	
	public static void main(String[] args) 
	{
		cyclicArrayDumb res = new cyclicArrayDumb();
		int[] nums = {3,8,9,7,6};
		int k = 3;
		nums = res.rotate(nums, k);
		for (int i : nums) 
		{
			System.out.print(i+" ");
		}
	}
}
