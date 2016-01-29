public class Solution {
	public int longestConsecutive(int[] num)
	{
		if (num.length ==0)
			return 0;
		
		HashMap<Integer,Integer> start =new HashMap<Integer,Integer>();
		HashMap<Integer,Integer> end =new HashMap<Integer,Integer>();
		Set<Integer> visited =new HashSet<Integer>();
		visited.add(num[0]);
		start.put(num[0],num[0]);
		end.put(num[0],num[0]);
		int max =1;
		for (int i=1;i<num.length;i++)
		{
			if (visited.contains(num[i]))
				continue;
			
			visited.add(num[i]);
			start.put(num[i], num[i]);
			end.put(num[i], num[i]);
			if (start.containsKey(num[i]+1))
			{
				start.put(num[i], start.get(num[i]+1));
				end.put(start.get(num[i]+1), num[i]);
				if (max <start.get(num[i]+1) -num[i]+1)
					max =start.get(num[i]+1) -num[i]+1;
			}
			if (end.containsKey(num[i]-1))
			{
				end.put(num[i],end.get(num[i]-1));
				start.put(end.get(num[i]-1), num[i]);
				if (max <num[i]-end.get(num[i])+1)
					max =num[i]-end.get(num[i])+1;

			}
			if (start.containsKey(num[i]+1) && end.containsKey(num[i]-1))
			{
				start.put(end.get(num[i]-1), start.get(num[i]+1));
				end.put(start.get(num[i]+1), end.get(num[i]-1));
				if (max <start.get(num[i]+1) -end.get(num[i]-1)+1)
					max =start.get(num[i]+1) -end.get(num[i]-1)+1;
			}
			
		}
		
		return max;
    }
    
}
