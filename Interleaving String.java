public class Solution {
	public boolean isInterleave(String s1, String s2, String s3) {
        boolean dp[][] =new boolean[s1.length()+1][s2.length()+1];
        boolean inter =true;
        dp[0][0] =true;
        int i=1;
        while (i<=s3.length())
        {
        	int j=0;
        	inter =false;
        	while (j<i)
        	{
        		if ((dp[j][i-j-1] ==true)&&(j<s1.length()))
        		{
        			if (s1.charAt(j) ==s3.charAt(i-1))
        			{
        				inter =true;
        				dp[i][j] =true;
        			}
        		}
        		else if ((dp[j][i-j-1] ==true)&&(i-j-1<s2.length()))
        		{
        			if (s2.charAt(i-j-1) ==s3.charAt(i-1));
        			{
        				inter =true;
        				dp[i][j] =true;
        			}
        		}
        		else
        			dp[i][j] =false;
        		
        		j++;
        	}
        	if (inter ==false)
        		return false;
        	
        	i++;
        }
        
        return true;
    }

}
