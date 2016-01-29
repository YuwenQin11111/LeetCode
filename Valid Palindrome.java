public class Solution {
	public boolean isPalindrome(String s) 
	{
	    s=s.toLowerCase();
		boolean result =true;
		int start =0;
		int end =s.length()-1;
		while (start <end)
		{
			while (!valid(s.charAt(start)))
			{
				start++;
				if (start>=end)
				    break;
			}
			while (!valid(s.charAt(end)))
			{
				end--;
				if (start>=end)
				    break;
			}
			if (end<=start)
				return true;
			
			if (s.charAt(start) !=s.charAt(end))
			{
			    
				return false;
				
			}
			
			start++;
			end--;
		}
		
		return true;
	}
		
	
	public boolean valid(char ch)
	{
		if (ch<='9'&& ch>='0')
			return true;
		if (ch<='z'&& ch>='a')
			return true;
		if (ch<='Z'&& ch>='A')
			return true;
		
		return false;
	}
}
