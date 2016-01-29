public class Solution {
    public int minimumTotal(ArrayList<ArrayList<Integer>> triangle) {
    	if (triangle ==null)
    		return 0;
    	
    	int numRow =triangle.size();
    	int[] path =new int[numRow];
    	int[] prev =new int[numRow];
    	path[0] =triangle.get(0).get(0);
    	prev[0] =path[0];
    	int i=1;
    	while (i<numRow)
    	{
    		path[0] =prev[0]+triangle.get(i).get(0);
    		path[i] =prev[i-1]+triangle.get(i).get(i);
    		int j=1;
    		while (j<i)
    		{
    			int max =prev[j-1];
    			if (max>prev[j])
    				max =prev[j];
    			path[j] =max+triangle.get(i).get(j);
    			j++;
    			
    		}
    		j=0;
    		while (j<=i)
    		{
    			prev[j] =path[j];
    			j++;
    		}
    		i++;
    	}
    	int min =path[0];
    	for (i=1;i<numRow;i++)
    	{
    		if (min>path[i])
    			min =path[i];

    	}
    	
    	return min;
	}
}
