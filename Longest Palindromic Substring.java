public class Solution {
	public String longestPalindrome(String s) {
		if (s.length() ==0 )
			return "";
		
		int max =1;
		int start =0;
		int end =0;
		for (int i=0;i<s.length();i++)
		{
			int len =1;
			while (i- len >=0 && i+len <s.length())
			{
				if (s.charAt(i-len) !=s.charAt(i+len))
					break;
				len+=2;
			}
			if (len >max)
			{
				max =len;
				start =i-len;
				end =i+len;
			}
		}
		
		for (int i=0;i<s.length()-1;i++)
		{
			if (s.charAt(i) !=s.charAt(i+1))
				continue;
			
			int len =2;
			while (i-len >=0 && i+len+1 <s.length())
			{
				if (s.charAt(i-len) !=s.charAt(i+len+1))
					break;
				len+=2;
			}
			if (len >max)
			{
				max =len;
				start =i-len;
				end =i+len+1;
			}
		}
		return s.substring(start,end+1);
		
    }

}
