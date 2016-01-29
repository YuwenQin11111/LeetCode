public class Solution {
	public int atoi(String str) {
		str =str.trim();
		if (str.length() ==0)
			return 0;
		
		if (str.charAt(0)<'0' || str.charAt(0) >'9')
		{
		    if (str.charAt(0) !='-' &&str.charAt(0) !='+')
		        return 0;
		}
		
		int i=0;
		int neg =0;
		while (i<str.length())
		{
			if (str.charAt(i)>='0' && str.charAt(i)<='9')
				break;
			
			if (str.charAt(i) =='-')
			{
				neg =1;
				i++;
				break;
			}
			
			if (str.charAt(i) =='+')
			{
				neg =0;
				i++;
				break;
			}
			
			i++;
		}
		if (i >=str.length())
			return 0;
		
		
		if (i>0)
		{
			if (str.charAt(i-1) =='-')
				neg =1;
		}
		long res =0;
		boolean valid =false;
		while (i<str.length())
		{
			if (str.charAt(i)<'0' ||str.charAt(i)>'9')
			{
				break;
			}
			
			res =res*10+str.charAt(i) -'0';
			System.out.println(res);
			valid =true;
			if (res >0x7fffffff ||res <0)
			{
				if (neg ==0)
					return Integer.MAX_VALUE;
				
				else
					return Integer.MIN_VALUE;
			}
			
			i++;
		}
		
		if (valid ==false)
			return 0;
		
		if (neg ==1)
			res =res*(-1);
		
		return (int)res;
    }

}
