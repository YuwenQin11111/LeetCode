public class Solution {
	boolean visit[][];
	char b[][];
	int m,n;
	 public boolean exist(char[][] board, String word) {
		 m=board.length;
		 if (m ==0)
			 return false;
		 
		 n=board[0].length;
		 if (n ==0)
			 return false;
		 
		 if (word.length() ==0)
			 return true;
		 
		 visit =new boolean[m][n];
		 b =new char[m][n];
		 for (int i=0;i<m;i++)
		 {
			 for (int j=0;j<n;j++)
			 {
				 visit[i][j] =false;
				 b[i][j] =board[i][j];
			 }
		 }
		 for (int i=0;i<m;i++)
		 {
			 for (int j=0;j<n;i++)
			 {
				 if (b[i][j] !=word.charAt(0))
					 continue;
				 
				 visit[i][j] =true;
				 if (dfs(i,j,word.substring(1,word.length())))
					 return true;
				 visit[i][j] =false;
			 }
		 }
		 
		 return false;
    }
	
	public boolean dfs(int i, int j, String word)
	{
		if (word.length() ==0)
			return true;
		
		if (i <m-1)
		{
			if (!visit[i+1][j]&&b[i+1][j] ==word.charAt(0))
			{
				visit[i+1][j] =true;
				if (dfs(i+1,j,word.substring(1,word.length())))
					return true;
				visit[i+1][j] =false;
				
			}
		}
		if (i>0)
		{
			if (!visit[i-1][j]&&b[i-1][j] ==word.charAt(0))
			{
				visit[i-1][j] =true;
				if (dfs(i-1,j,word.substring(1,word.length())))
					return true;
				visit[i-1][j] =false;
				
			}
			
		}
		if (j <n-1)
		{
			if (!visit[i][j+1]&&b[i][j+1] ==word.charAt(0))
			{
				visit[i][j+1] =true;
				if (dfs(i,j+1,word.substring(1,word.length())))
					return true;
				visit[i][j+1] =false;
			}
		}
		if (j>0)
		{
			if (!visit[i][j-1]&&b[i][j-1] ==word.charAt(0))
			{
				visit[i][j-1] =true;
				if (dfs(i,j-1,word.substring(1,word.length())))
					return true;
				visit[i][j-1] =false;
			}
		}
		
		return false;
	}

}
