public class Solution {
	ArrayList<String[]> result =new ArrayList<String[]>();
	String[] map =new String[100];
	public ArrayList<String[]> solveNQueens(int n) {
		if (n ==0)		
			return result;
		
		for (int i=0;i<n;i++)
		{
			map[i] ="";
			for (int j=0;j<n;j++)
			{
				map[i] +=".";
			}
			
		}
		
		generateResult(n,0);
		return result;
    }
	
	public void generateResult(int n,int level)
	{
		if (level >=n)
		{
			String[] newmap =new String[n];
			for (int i=0;i<n;i++)
			{
				newmap[i] =map[i];
			}
			result.add(newmap);
		}
		
		for (int i=0;i<n;i++)
		{
			if (isvalid(level,i,n))
			{
				map[level] =map[level].substring(0,i)+"Q"+map[level].substring(i+1,n);
				generateResult(n,level+1);
				map[level] =map[level].substring(0,i)+"."+map[level].substring(i+1,n);
			}
			
		}
		
	}
		
	public boolean isvalid(int level,int col,int n)
	{
		for (int i=0;i<level;i++)
		{
			if (map[i].charAt(col) =='Q')
				return false;
		}
		
		int i=level-1;
		int j=col-1;
		while (i>=0&&j>=0)
		{
			if (map[i].charAt(j) =='Q')
				return false;
			i--;
			j--;
		}
		
		i=level-1;
		j=col+1;
		while (i>=0&&j<n)
		{
			if (map[i].charAt(j) =='Q')
				return false;
			i--;
			j++;
		}
		
		return true;
	}

}
