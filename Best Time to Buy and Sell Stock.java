public class Solution {
    public int maxProfit(int[] prices) {
    	if (prices.length <=1)
    		return 0;
    	
    	int minPrice =prices[0];
    	int maxProfit =0;
    	for (int i=1;i <prices.length;i++)
    	{
    		if (maxProfit< prices[i]-minPrice)
    			maxProfit =prices[i]-minPrice;
    		
    		if (minPrice>prices[i])
    			minPrice =prices[i];
    		
    		
    	}
    	return maxProfit;
    	
	}
}
