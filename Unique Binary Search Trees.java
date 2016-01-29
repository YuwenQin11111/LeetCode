public class Solution {
	public int numTrees(int n) {
        int[] dp =new int[n+1];
        dp[0] =1;
        int i=1;
        while (i<=n)
        {
        	int sum =0;
        	int j=0;
        	while (j<i)
        	{
        		sum +=dp[j] *dp[i-1-j];
        		j++;
        	}
        	dp[i] =sum;
        	i++;
        }
        return dp[n];
    }

}
