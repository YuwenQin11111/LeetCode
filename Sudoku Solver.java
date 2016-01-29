public class Solution {
	boolean ret =false;
	public void solveSudoku(char[][] board) {
		if (ret ==true)
			return;
		
		boolean exist =false;
		for (int i=0;i<9;i++)
		{
			for (int j=0;j<9;j++)
			{
				if (board[i][j] =='.')
				{
					exist =true;
					for (int k=1;k<10;k++)
					{
						board[i][j] =(char)(k+'0');
						if (isValid(board,i,j))
						{
							solveSudoku(board);
							if (ret ==true)
								return;
						}
						board[i][j] ='.';
					}
					
				}
				
			}
			
		}
		
		if (exist ==false)
			ret =true;
		
		return;
	}
	
	public boolean isValid(char[][] board,int y,int x) {
		if (board.length !=9)
			return false;
		
		int m =board.length;
		
		if (board[0].length !=9)
			return false;
		
		int n=board[0].length;
		
		for (int i=0;i<9;i++)
		{
			if (board[i][x] ==board[y][x] &&i!=y)
				return false;
		}
		
		for (int i=0;i<9;i++)
		{
			if (board[y][i] ==board[y][x] &&i!=x)
				return false;
			
		}
		
		for (int idy =(y/3)*3;idy<(y/3)*3+2;idy++)
		{
			for (int idx =(x/3)*3;idx<(x/3)*3+2;idx++)
			{
				if (idx ==x&&idy==y)
					continue;
				
				if (board[y][x] ==board[idy][idx])
					return false;
			}
		}
		
		return true;
    }

}
