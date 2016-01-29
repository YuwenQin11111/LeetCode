public class Solution {
	public int[] searchRange(int[] A, int target) {
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
		int ret[] =new int[2];
		if (start >end)
		{
			ret[0] =-1;
			ret[1] =-1;
			return ret;
		}
		ret[0] =mid;
		start =0;
		end =A.length-1;
		while (start <=end)
		{
			mid =(start+end)/2;
			if (A[mid] ==target)
			{
				if (mid ==A.length-1)
					break;
				else
				{
					if (A[mid+1] !=target)
						break;
				}
			}
			
			if (A[mid] <target)
			{
				start =mid+1;
				
			}
			else
			{
				end =mid-1;
				
			}
		}
		ret[0] =mid;
		return ret;
    }

}
