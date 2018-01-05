package Solutions;

import java.lang.reflect.Array;

public class HackerRankTest1 
{
	static void countUp(int start)
	{ 		
		for (int N = start+1 ; N <= (start+10); N++)
		{
			if(N < (start+10))
			System.out.print(N +" "+ "then ");
			else
			System.out.print(N);
		}
	}
	
	static int[] carParking(int n, int[][] available)
	{
		int [] firAvSp = new int [2];
		int avSp = 0;
		
		
		for (int i = 0; i < available.length; i++) 
		{
			int temp = 0;
			
			for (int j = 0; j < available.length; j++) 
			{
				if (available[i][j] == 0) 
				{
					 temp+=1;
				}
			}
			if (avSp < temp) 
			{
				firAvSp[0] = i;
				avSp = temp;
			}
		}
		
		for (int j = 0; j < n ; j++) 
		{
			if (available[firAvSp[0]][j] == 0) 
			{
				firAvSp[1] = j;
				break;
			}
		}
		firAvSp[0]+=1;
		firAvSp[1]+=1;
		return firAvSp;
	}

	public static void main(String[] args) 
	{
		//countUp(9);
		int [][] space = 
			{
					{1,1,1,0,0},
					{1,1,1,1,0},
					{1,1,0,0,0},
					{1,1,1,0,0},
					{1,0,0,0,0}
			};
		
		int[] anArray = carParking(5, space);
		
		printArray(anArray);
	}
	
	private static void printArray(int[] anArray) 
	{
	      for (int i = 0; i < anArray.length; i++) 
	      {
	         if (i > 0) 
	         {
	            System.out.print(", ");
	         }
	         System.out.print(anArray[i]);
	      }
	   }

}
