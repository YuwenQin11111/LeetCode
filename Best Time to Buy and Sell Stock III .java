public class Solution {
    public int maxProfit(int[] prices) {
    	if (prices.length <=1)
    		return 0;
    	
    	int minPrice =prices[0];
    	int mProfit =0;
    	int[] firstProfit =new int[prices.length];
    	int[] maxPrices =new int[prices.length];
    	
    	for (int i=1;i<prices.length;i++)
    	{
    		if (mProfit <prices[i]-minPrice)
    			mProfit =prices[i]-minPrice;
    		
    		if (minPrice >prices[i])
    			minPrice =prices[i];
    		
    		firstProfit[i] =mProfit;
    		
    	}
    	
    	int mPrice =prices[prices.length-1];
    	for (int i=prices.length-1;i>=1;i--)
    	{
    		if (mPrice< prices[i])
    			mPrice =prices[i];
    		
    		maxPrices[i] =mPrice;
    		
    	}
    	int maxProfit =firstProfit[prices.length-1];
    	for (int i=1;i<prices.length-1;i++)
    	{
    		if (maxProfit <firstProfit[i]+maxPrices[i]-prices[i])
    			maxProfit =firstProfit[i]+maxPrices[i]-prices[i];
    	}
    	
    	return maxProfit;
	}
}
