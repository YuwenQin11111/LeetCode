public class Solution {
	public boolean search(int[] A, int target) {
		int len =A.length;
		if (len ==0)
			return false;
		
		int start =0;
		int end =len -1;
		int mid =-1;
		if (A[start] >=A[end])
		{
			while (start <end)
			{
				mid =(start+end)/2;
				if (A[mid]>A[mid+1])
					break;
			
				if (A[start] >A[mid])
					end =mid;
				else if (A[mid+1] >A[end])
					start =mid+1;
				else
				    start ++;
			}
		}
		
		if (target>=A[0])
		{
			start =0;
			end =mid;
			if (end <0)
				end =len-1;
		}
		else
		{
			start =mid+1;
			end =len-1;

		}
		
		while (start <=end)
		{
			mid =(start+end)/2;
			if (A[mid] ==target)
				break;
			
			if (A[mid] >target)
				end =mid-1;
			else
				start =mid+1;
		}
		if (A[mid] ==target)
			return true;
		
		return false;
    }
    
}
