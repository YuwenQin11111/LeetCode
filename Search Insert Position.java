public class Solution {
	public int searchInsert(int[] A, int target) {
		int start =0;
		int end =A.length-1;
		int mid =0;
		while (start <=end)
		{
			mid =(start+end)/2;
			if (A[mid] ==target)
			{
				if (mid ==0)
					break;
				else
				{
					if (A[mid-1] !=target)
						break;
				}
			}
			
			if (A[mid] <=target)
			{
				start =mid+1;
				
			}
			else
			{
				end =mid-1;
				
			}
		}
		return (start+end)/2;
    }

}
