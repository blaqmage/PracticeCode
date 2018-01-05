package Solutions;

import java.util.ArrayList;
import java.util.Collections;

public class testInterview 
{
	public static int calcPhoneBill(ArrayList<Integer> Ary)
	{
		int amount = 0;
		int extra = 0;
		int size = Ary.size();
		
		//Remove highest call time
		if (size > 1)
		{
			Collections.sort(Ary);
			Ary.remove(size-1);
		}
		
		//Calculate the bill
		for (int i = 0; i < Ary.size(); i++) 
		{
			if (Ary.get(i) < 300) 
			{
				amount+=(Ary.get(i) * 3);
				
			}
			else
			{
				amount+=(Ary.get(i)/60)*150;
				extra = Ary.get(i)%60;
				if (extra > 0) 
				{
					amount+=150;
				}
			}
		}
		return amount;
	}
	
	public static int convertToSecs(ArrayList<String> data, int i)
	{	
		int timeInSecs = 0;
		
		String[] set = data.get(i).split(":");
			for (@SuppressWarnings("unused") String a : set) 
			{
				int hh = Integer.parseInt(set[0]);
				int mm = Integer.parseInt(set[1]);
				int ss = Integer.parseInt(set[2]);
				
				timeInSecs = (hh*3600) + (mm*60) + ss;
			}
			return timeInSecs;
	}
	
	public int solution(String S)
	{
		ArrayList<String> duration = new ArrayList<>();
		ArrayList<String> phoneNo = new ArrayList<>();
		ArrayList<Integer> sumNo = new ArrayList<>();
		
		String[] s2 = S.split("\n");
		for (String line : s2) 
		{
			String[] set = line.split(",");
			for (int i = 0; i < set.length; i++) 
			{
				if (i%2 == 0) 
				{
					duration.add(set[i]);
				}
				else 
				{
					phoneNo.add(set[i]);
				}
			}
		}
		
		//Create array to store time in seconds
		int[] timeInSecs = new int[duration.size()];
		
		//Convert phone time to seconds of type Integer
		for (int i = 0; i < duration.size(); i++) 
		{
			timeInSecs[i] = convertToSecs(duration, i);
		}
		
		//Create list of distinct numbers
		ArrayList<String> list = new ArrayList<>();
		for (String a : phoneNo) 
		{
			if(!list.contains(a))
				list.add(a);
		}
		
		for (String s : list) 
		{
			int amount = 0;
			int i = 0;
			
			for (String a : phoneNo) 
			{
				if (s.equals(a)) 
				{
					amount+=timeInSecs[i];
				}
				i++;
			}
			sumNo.add(amount);
		}
		
		
		return calcPhoneBill(sumNo);
	}
	
	public int checkdupes()
	{
		
		return 0;
	}

	public static void main(String[] args) 
	{
		testInterview res = new testInterview();
		String s = "00:01:07,400-234-090\n00:05:01,701-080-080\n00:05:00,400-234-090\n00:00:20,321-316-2833";
		String b = "yes";
		System.out.println(res.solution(s));
		int c = b.charAt(2) - 'a';
		System.out.println(c);
	}
}
