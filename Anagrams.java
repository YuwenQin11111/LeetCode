public class Solution {
	public ArrayListString anagrams(String[] strs) {
		ArrayListString result =new ArrayListString();
		
		if (strs.length ==0)
			return result;
		
		HashMapString,ArrayListString map =new HashMapString,ArrayListString();
		for (int i=0;istrs.length;i++)
		{
			char[] charr =strs[i].toCharArray();
			Arrays.sort(charr);
			String str =String.valueOf(charr);
			if (map.containsKey(str))
			{
				map.get(str).add(strs[i]);
				
			}
			else
			{
				ArrayListString list =new ArrayListString();
				list.add(strs[i]);
				map.put(str, list);
			}
			
		}
		
		for (ArrayListString valmap.values())
		{
			if (val.size() 1)
			{
				for (String vval)
				{
					result.add(v);
				}
				
			}
		}
		
		return result;
    }
}

