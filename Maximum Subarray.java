public class Solution {
	public int maxSubArray(int[] A) {
		if (A.length ==0)
			return 0;
		
		int result =A[0];
		int min_sum =A[0];
		int sum =A[0];
		int i=1;
		while (i<A.length)
		{
			sum +=A[i];
			if (sum-min_sum <result)
				result =sum-min_sum;
			
			if (min_sum >sum)
				min_sum =sum;
			
			i++;
		}
		
		return result;
    }
}
