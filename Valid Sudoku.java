public class Solution {
	public boolean isValidSudoku(char[][] board) {
		if (board.length !=9)
			return false;
		
		int m =board.length;
		
		if (board[0].length !=9)
			return false;
		
		int n=board[0].length;
		boolean[] exist =new boolean[10]; 
		for (int i=0;i<m;i++)
		{
			for (int j=0;j<=9;j++)
				exist[j] =false;
			
			for (int j=0;j<n;j++)
			{
				if (board[i][j] <='9' &&board[i][j] >='0')
				{
					int val =board[i][j] -'0';
					if (exist[val] ==true)
						return false;
					
					exist[val] =true;
				}
			}
		}
		
		for (int i=0;i<n;i++)
		{
			for (int j=0;j<=9;j++)
				exist[j] =false;
			
			for (int j=0;j<m;j++)
			{
				if (board[j][i] <='9' &&board[j][i] >='0')
				{
					int val =board[j][i] -'0';
					if (exist[val] ==true)
						return false;
					
					exist[val] =true;
				}
			}
		}
		
		boolean[][][] possible =new boolean[m][n][10];
		int[][] num=new int[m][n];
		for (int i=0;i<m;i++)
		{
			for (int j=0;j<n;j++)
			{
				num[i][j] =0;
				for (int k=0;k<=9;k++)
					possible[i][j][k] =false;
			}
		}
		
		for (int i=1;i<m;i+=3)
		{
			for (int j=1;j<n;j+=3)
			{
				for (int k=0;k<=9;k++)
					exist[k] =false;
				
						for (int idx =i-1;idx<=i+1;idx++)
						{
							for (int idy =j-1;idy<=j+1;idy++)
							{
							        
								if (idx>=0&&idx<m&&idy>=0&&idy<n)
								{
									if (board[idx][idy]-'0' >=1&&board[idx][idy]-'0'<=9)
									{
									    int val =(idx-i+1)*3+idy-j+1;
									    if (exist[val] ==true)
									    	return false;
									    
									    exist[val] =true;
									}
									
								
								}
							}
						
					
				}
				
			}
		}
		
		return true;
    }
}
