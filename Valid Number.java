public class Solution {
	public boolean isNumber(String s) {
		if (s ==null)
			return false;
		
		boolean hasE =false;
		s =s.trim();
		if (s.length() ==0)
			return false;
		
		if (s.charAt(0) =='+' ||s.charAt(0) =='-')
			s=s.substring(1,s.length());
		
		int ind =0;
		int i=0;
		while (i<s.length())
		{
			if (s.charAt(ind) =='e' ||s.charAt(ind) =='E')
			{
				if (hasE) return false;
				else{
					hasE =true;
					ind =i;
				}
			}
			
			i++;
		}
		
		if (hasE)
		{
			if (prefixNumber(s.substring(0, ind)) &&suffixNumber(s.substring(ind+1, s.length())))
				return true;
			else
				return false;
		}
		else
		{
			if (prefixNumber(s))
				return true;
			else
				return false;
		}
		
    }
	
	public boolean suffixNumber(String s)
	{
		if (s.length() ==0)
			return false;
		
		if (s.charAt(0) =='+' ||s.charAt(0) =='-')
			s =s.substring(1,s.length());
		
		if (s.length() ==0)
			return true;
		
		return pureNumber(s);
	}
	
	public boolean prefixNumber(String s)
	{
		if (s.length() ==0)
			return false;
		
		int dotind =-1;
		int i=0;
		while (i<s.length())
		{
			if (s.charAt(i) =='.')
			{
				dotind =i;
			}
			i++;
		}
		if (dotind ==-1)
		{
			return pureNumber(s);
			
		}
		else
		{
			String sa =s.substring(0,dotind);
			String sb =s.substring(dotind+1,s.length());
			if (sa.length() ==0)
				return pureNumber(sb);
			
			else if (sb.length() ==0)
				return pureNumber(sa);
			
			else 
				return pureNumber(sa) &&pureNumber(sb);
		}
		
	}
	
	public boolean pureNumber(String s)
	{
		if (s.length() ==0)
			return false;
		
		for (int i=0;i<s.length();i++)
		{
			if (s.charAt(i) >='0' &&s.charAt(i) <='9')
				continue;
			else
				return false;
			
		}
		
		return true;
	}

}
