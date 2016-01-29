public class Solution {
	public boolean isMatch(String s, String p) {
		return match(s,p,0,0);
		
		
		
    }
	
	public boolean match(String s,String p,int pos_s,int pos_p)
	{
		if (pos_s >=s.length() &&pos_p>=p.length())
			return true;
		
		if (pos_p >=p.length())
			return false;
		
		if (pos_s >=s.length())
		{
			if (p.length()-pos_p-1 >=1)
			{
				if (p.charAt(pos_p) =='.' &&p.charAt(pos_p+1) =='*')
				{
					if (match(s,p,pos_s,pos_p+2))
						return true;
					else
						return false;
				}
				
				return false;
						
			}
			else if (pos_p <p.length())
			{
				if (p.charAt(pos_p) =='*')
				{
					if (match(s,p,pos_s,pos_p+1))
						return true;
					else
						return false;
				}
				
			}
			return false;
			
		}
		
		if (pos_p+1 <p.length())
		{
			if (p.charAt(pos_p+1) =='*')
			{
				if (p.charAt(pos_p) =='.')
				{
					int pos =pos_s;
					while (pos<=s.length())
					{
						if (match(s,p,pos,pos_p+2))
							return true;
						
						pos++;
					}
				}
				else
				{
					if (match(s,p,pos_s,pos_p+2) ==true)
						return true;
					
					int pos =pos_s;
					while (pos<s.length())
					{
						if (s.charAt(pos)!=p.charAt(pos_p))
							break;
						
						if (match(s,p,pos+1,pos_p+2) ==true)
							return true;
						
						pos ++;
					}
				}
			
			}
			else
			{	
				if (s.charAt(pos_s) ==p.charAt(pos_p) ||p.charAt(pos_p) =='.')
				{
					if (match(s,p,pos_s+1,pos_p+1) ==true)
						return true;
					
				}
			}
			
		}
		else
		{
			if (s.charAt(pos_s) ==p.charAt(pos_p) ||p.charAt(pos_p) =='.')
			{
				if (match(s,p,pos_s+1,pos_p+1) ==true)
					return true;
				
			}
			
		}
		
		return false;
	}

}
