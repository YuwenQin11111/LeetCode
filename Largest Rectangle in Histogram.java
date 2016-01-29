public class Solution {
	public int largestRectangleArea(int[] height) {
        int max_val =0;
        int len =height.length;
        if (len ==0)
        	return 0;
        
        for (int i=0;i<len;i++)
        {
        	for (int k=i+1;k<len;k++)
        	{
        		if (height[k]<height[k-1])
        		{
        			i=k-1;
        			break;
        		}
        		else
        			i=k;
        		
        	}
        	
        	int low =height[i];
        	for (int k=i;k>=0;k--)
        	{
        		if (low>height[k])
        			low =height[k];
        		
        		if (max_val <low*(i-k+1))
        			max_val =low*(i-k+1);
        	}
        	
        }
        return max_val;
    }
}
