public class Solution {
	public int reverse(int x) {
		int ret =0;
		int neg =0;
		if (x<0)
		{
			neg =1;
		    	x =x*(-1);
		}
		
		while (x>0)
		{
			ret =ret*10 +(x%10);
			if (ret >0x7fffffff)
				return 0;
			x =x/10;
		}
		
		if (neg ==1)
			ret =ret*(-1);
		
		return ret;
    }
}
