public class Solution {
	public int romanToInt(String s) {
		int ans =0;
		int i=0;
		while (i<s.length())
		{
			if (i+1<s.length())
			{
				if (val(s.charAt(i)) <val(s.charAt(i+1)))
				{
					ans += val(s.charAt(i+1)) -val(s.charAt(i));
					i+=2;
				}
				else
				{
					ans +=val(s.charAt(i));
					i++;
				}
			}
			else
			{
				ans += val(s.charAt(i));
				i++;
			}
			
		}
		
		return ans;
    }
	
	public int val(char ch)
	{
		int ret =0;
		switch (ch)
		{
			case 'I':
				ret =1;
				break;
			case 'V':
				ret =5;
				break;
			case 'X':
				ret =10;
				break;
			case 'L':
				ret =50;
				break;
			case 'C':
				ret =100;
				break;
			case 'D':
				ret =500;
				break;
			case 'M':
				ret =1000;
				break;
			default:
				ret =0;
				break;
		}
		return ret;
	}

}
