public class Solution {
	public String simplifyPath(String path) {
		String[] s =new String[path.length()];
		if (path.length() ==0)
			return "/";
		
		int len =0;
		int end =0;
		int start =0;
		while (start<path.length())
		{
			if (path.charAt(start) !='/')
				break;
			start++;
		}
		
		end =start;
		while (start<path.length())
		{
			while (end<path.length())
			{
				if (path.charAt(end) =='/')
					break;
				
				end++;
				
			}
			String str =path.substring(start,end);
			if (str.equals(".."))
			{
				if (len>0)
					len--;
			}
			else if (!str.equals("."))
			{
				s[len++] =str;
			}
			
			while (end <path.length())
			{
				if (path.charAt(end) !='/')
					break;
				
				end++;
			}
			start =end;
			
		}
		
		String result ="/";
		for (int i=0;i<len;i++)
		{
			result +=s[i];
			if (i<len-1)
				result +="/";
		}
		
		return result;
    }
}
