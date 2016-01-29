public class Solution {
	public int lengthOfLastWord(String s) {
		int i=s.length()-1;
		while (i>=0)
		{
			if (s.charAt(i) !=' ')
				break;
			i--;
		}
		if (i <0)
			return 0;
		
		int j=i-1;
		while (j>=0)
		{
			if (s.charAt(j) ==' ')
				break;
			j--;
		}
		return (i-j);
    }

}
