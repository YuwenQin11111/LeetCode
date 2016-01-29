public class Solution {
	public int[] plusOne(int[] digits) {
		if (digits.length ==0)
			return digits;
		
		int len =digits.length;
		int all_len =len;
		int i;
		for (i=0;i<len;i++)
		{
			if (digits[i] !=9)
				break;
		}
		
		if (i>=len)
			all_len++;
		
		int[] ret =new int[all_len];
		if (all_len !=len)
		{
			ret[0] =1;
			for (i =1;i<all_len;i++)
				ret[i] =0;
		}
		else
		{
			i=len-1;
			int add =1;
			while (i>=0)
			{
				ret[i] =(digits[i]+add)%10;
				add =(digits[i]+add)/10;
				i--;
			}
		}
		
		return ret;
	}
}
