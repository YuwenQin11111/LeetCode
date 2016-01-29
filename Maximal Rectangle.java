public class Solution {
	public int maximalRectangle(char[][] matrix) {
		int m=matrix.length;
		if (m == 0)
			return 0;
		
		int n=matrix[0].length;
		if (n == 0)
			return 0;
		
		int dp[][] =new int[m][n];
		int area[][] =new int[m][n];
		
		for (int i=0;i<m;i++)
		{
			if (matrix[i][n-1] =='1')
				dp[i][n-1] =1;
			else
				dp[i][n-1] =0;
			
			for (int j=n-2;j>=0;j--)
			{
				if (matrix[i][j] =='1')
					dp[i][j] =dp[i][j+1]+1;
				else
					dp[i][j] =0;
				
			}
		}
		
		int max_val =0;
		for (int i=0;i<m;i++)
		{
			for (int j=0;j<n;j++)
			{
				int min =n;
				for (int k=i;k<m;k++)
				{
					if (dp[k][j] ==0)
						break;
					
					if (min >dp[k][j])
						min =dp[k][j];
					
					if (min*(k-i+1) >max_val)
						max_val =min*(k-i+1);
				}
				
			}
		}
		
		return max_val;
	}
}
