public class Solution {
	public String longestCommonPrefix(String[] strs) {
		if (strs.length ==0)
			return "";
		
		String ans =strs[0];
		for (int i=1;i <strs.length;i++)
		{
			String temp ="";
			int j=0;
			while (j<ans.length() && j<strs[i].length())
			{
				if (ans.charAt(j) !=strs[i].charAt(j))
					break;
				
				temp =temp+strs[j].charAt(j);
				j++;
			}
			
			ans =temp;
		}
		
		return ans;
    }

}
