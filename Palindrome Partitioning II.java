public class Solution {
	public int minCut(String s)
	{
		boolean[][] pal =new boolean[s.length()+1][s.length()+1];
		
		for (int i=0;i<s.length();i++)
		{
			pal[i][i] =true;
			pal[i+1][i] =true;
		}
		
		for (int l =1;l<s.length();l++)
		{
			for (int i=0;i<s.length()-l;i++)
			{
				pal[i][i+l] =false;
				
				if (pal[i+1][i+l-1] ==false)
					pal[i][i+l]=false;
				
				else
				{
					if (s.charAt(i) ==s.charAt(i+l))
					{
						pal[i][i+l] =true;
					}
					else
						pal[i][i+l] =false;
					
				}
			}
			
		}
		
				
		int dp[] =new int[s.length()];
		
		dp[0]=1;
		for (int i=1;i<s.length();i++)
		{
			dp[i] =dp[i-1]+1;
			if (pal[0][i] ==true)
			{
				dp[i] =1;
				continue;
			}
			
			for (int j=1;j<i;j++)
			{
				if (dp[i]>dp[j-1]+1 && pal[j][i] ==true)
				{
					dp[i] =dp[j-1]+1;
					
				}
				
			}
		}
		
		return dp[s.length()-1]-1;
	}
		

	
	public static void main(String args[])
	{
    	Solution sol =new Solution();
    	
    	int[] a=new int[1];
    	a[0]=1;
    	/*
    	a[1]=0;
    	a[2]=0;
    	a[3]=1;
    	a[4]=1;
    	a[5]=1;
    	a[6]=99;
    	*/
    	//int result =sol.singleNumber(a);
    	//System.out.println(result);
    	
    	System.out.println(sol.minCut("cdd"));
    	
	}
}
