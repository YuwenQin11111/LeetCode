public class Solution {
	public int minDistance(String word1, String word2) {
		int[][] dp=new int[word1.length()+1][word2.length()+1];
		for (int i=1;i<=word1.length();i++)
			dp[i][0] =i;
		
		for (int i=1;i<=word2.length();i++)
			dp[0][i] =i;
		
		for (int i=1;i<=word1.length();i++)
		{
			for (int j=1;j<=word2.length();j++)
			{
				int num =dp[i-1][j-1];
				if (word1.charAt(i) !=word2.charAt(j))
					num++;
				
				if (num >dp[i][j-1]+1)
					num =dp[i][j-1]+1;
				
				if (num>dp[i-1][j]+1)
					num =dp[i-1][j]+1;
				
				dp[i][j] =num;
			}
		}
		
		return dp[word1.length()][word2.length()];
	}

}
