public class Solution {
	public int sqrt(int x) {
		if (x<=0)
			return 0;
		
		int start =1;
		int end =x;
		int mid =(start+end)/2;
		while (!(mid*mid<=x && (mid+1)*(mid+1)>x))
		{
			if (mid*mid>x)
				end =mid-1;
			
			if ((mid+1)*(mid+1) <=x)
				start =mid+1;
			
			mid =(start+end)/2;
			
		}
		
		int val =(int)Math.sqrt((double)x);
		return mid;
	}

}
