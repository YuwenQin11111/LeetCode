public class Solution {
	public boolean isPalindrome(int x) {
		if (x ==Integer.MAX_VALUE ||x ==Integer.MIN_VALUE)
			return false;
		
		if (x<0)
			return false;
		
		int i=0;
		int[] digit =new int[12];
		while (x>0)
		{
			digit[i++] =x%10;
			x=x/10;
		}
		
		int len =i;
		i=0;
		int j=len-1;
		while (i<=j)
		{
			if (digit[i] !=digit[j])
				return false;
			
			i++;
			j--;
		}
		
		return true;
    }

}
