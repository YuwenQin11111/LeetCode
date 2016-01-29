public class Solution {
	public int minPathSum(int[][] grid) {
		int m =grid.length;
		if (m ==0)
			return 0;
		
		int n=grid[0].length;
		if (n==0)
			return 0;
		
		int[][] path =new int[m][n];
		path[0][0] =grid[0][0];
		for (int i=1;i<n;i++)
			path[0][i]=path[0][i-1]+grid[0][i];
		
		for (int i=1;i<m;i++)
		{
			for (int j=0;j<n;j++)
			{
				if (j ==0)
					path[i][j] =path[i-1][j]+grid[i][j];
				
				else
				{
					if (path[i-1][j] >path[i][j-1])
						path[i][j] =path[i][j-1]+grid[i][j];
					else
						path[i][j] =path[i-1][j]+grid[i][j];
					
				}
			}
		}
		
		return path[m-1][n-1];
    }
}
