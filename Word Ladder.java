public class Solution {
	public int ladderLength(String start, String end, HashSet<String> dict) 
	{
		if (start.equals(end))
			return 1;
		
		Queue<String> q =new LinkedList<String>();
		HashMap<String,Integer> visited =new HashMap<String,Integer>();
		q.add(start);
		visited.put(start,1);
		while (!q.isEmpty())
		{
			String str =q.poll();
			//search other string
			for (int i=0;i<str.length();i++)
			{
				for (int j=0;j<26;j++)
				{
					StringBuilder nstr =new StringBuilder(str);
					nstr.setCharAt(i, (char)('a'+j));
					String sstr =nstr.toString();
					if (sstr.equals(end))
						return visited.get(str)+1;
					
					if (dict.contains(sstr) &&!visited.containsKey(sstr))
					{
						q.add(sstr);
						visited.put(sstr,visited.get(str)+1);
					}
				}
				
			}
			
		}
		
		return 0;
	}
	
}
