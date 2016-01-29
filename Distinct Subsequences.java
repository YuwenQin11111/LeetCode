public class Solution {
	public int numDistinct(String S, String T) {
	    if (S.length() ==0)
	        return 0;
	        
		int[][] dp =new int[S.length()+1][T.length()+1];
		if (S.charAt(0) ==T.charAt(0))
			dp[0][0] =1;
		
		for (int i=1;i<S.length();i++)
		{
			dp[i][0] =dp[i-1][0];
			if (S.charAt(i) ==T.charAt(0))
				dp[i][0]++;
			
			for (int j=1;j<T.length();j++)
			{
				dp[i][j] =dp[i-1][j];
				if (S.charAt(i) ==T.charAt(j))
					dp[i][j] +=dp[i-1][j-1];
			}
		}
		
		return dp[S.length()-1][T.length()-1];
    }
	
}
