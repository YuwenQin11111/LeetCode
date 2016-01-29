public class Solution {
	public int lengthOfLongestSubstring(String s) {
		if (s.length() ==0)
			return 0;
		
    	int start =0;
    	int end =0;
    	int max =1;
		boolean vis[] =new boolean[26];
		for (int i=0; i<26;i++)
			vis[i] =false;
		
		while (start <s.length())
		{
			while (end <s.length())
			{
				if (vis[s.charAt(end) -'a'])
					break;
				vis[s.charAt(end) -'a'] =true;
				end++;
			}
			
			if (end-start >max)
				max =end-start;
			
			vis[s.charAt(start)-'a'] =false;
			start++;
		}
		
		return max;
    }

}
