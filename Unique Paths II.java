public class Solution {
	public int uniquePathsWithObstacles(int[][] obstacleGrid) {
		int m=obstacleGrid.length;
		if (m ==0)
			return 0;
		
		int n=obstacleGrid[0].length;
		if (n ==0)
			return 0;
		
		int[][] path =new int[m][n];
		path[0][0] =1-obstacleGrid[0][0];
		for (int i=1;i<n;i++)
		{
			if (obstacleGrid[0][i] !=1 &&path[0][i-1] ==1)
				path[0][i] =1;
		}
		
		for (int i=1;i<m;i++)
		{
			for (int j=0;j<n;j++)
			{
				if (obstacleGrid[i][j] !=1)
				{
					path[i][j] +=path[i-1][j];
					if (j-1 >=0)
						path[i][j] +=path[i][j-1];
				}
			}
		}
		
		return path[m-1][n-1];
    }

}
