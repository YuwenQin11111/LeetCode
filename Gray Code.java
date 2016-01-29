public class Solution {
	public ArrayList<Integer> grayCode(int n) { 
		ArrayList<Integer> ans =new ArrayList<Integer>();
		if (n ==0)
		{
		    ans.add(0);
			return ans;
		}
		
		if (n ==1)
		{
			ans.add(0);
			ans.add(1);
			return ans;
		}
		ArrayList<Integer> oldans =grayCode(n-1);
		for (int i=0;i<oldans.size();i++)
			ans.add(oldans.get(i));
		
		for (int i=0;i<oldans.size();i++)
			ans.add(oldans.size() +oldans.get(oldans.size()-i-1));
		
		return ans;
	}

}
