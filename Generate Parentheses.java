public class Solution {
	ArrayList<ArrayList<String>> record =new ArrayList<ArrayList<String>>();
	public ArrayList<String> generateParenthesis(int n) {
		ArrayList<String> result =new ArrayList<String>();
		if (n ==0)
			return result;
		
		if (record.size() >=n)
			return record.get(n-1);
		
		if (n ==1)
		{
			result.add("()");
			if (record.size() <1)
				record.add(result);
			
			return result;
		}
		
		ArrayList<String> prev_result =generateParenthesis(n-1);
		for (int i=0;i<prev_result.size();i++)
		{
			String s =prev_result.get(i);
			String sa ="(" +s+")";
			if (!result.contains(sa))
				result.add(sa);
			
			String sb ="()"+s;
			if (!result.contains(sb))
				result.add(sb);
			
			String sc =s+"()";
			if (!result.contains(sc))
				result.add(sc);
		}
		
		for (int i=2;i<n/2;i+=2)
		{
			ArrayList<String> first_result =generateParenthesis(i);
			ArrayList<String> second_result =generateParenthesis(n-i);
			int j=0;
			while (i<first_result.size())
			{
				int k=0;
				while (j<second_result.size())
				{
					String sd =first_result.get(j)+second_result.get(k);
					if (!result.contains(sd))
						result.add(sd);
					
					j++;
				}
				k++;
			}
			
		}
		record.add(result);
		return result;
    }


}
