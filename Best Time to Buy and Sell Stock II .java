public class Solution {
    public int maxProfit(int[] prices) {
    	if (prices.length <=1)
    		return 0;
    	
    	int minPrice =prices[0];
    	int maxProfit =0;
    	for (int i=1;i <prices.length-1;i++)
    	{
    		if (prices[i]-minPrice >0 &&prices[i]>prices[i+1])
    		{
    			maxProfit +=prices[i]-minPrice;
    			minPrice =prices[i];
    		}
    		if (minPrice>prices[i])
    			minPrice =prices[i];
    		
    	}
    	
    	if (prices[prices.length-1]>minPrice)
    		maxProfit +=prices[prices.length-1]-minPrice;
    	
    	return maxProfit;
    	
	}
}
