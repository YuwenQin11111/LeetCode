public class Solution {
	public int trap(int[] A) {
		if (A.length ==0)
			return 0;
		
		Stack<Integer> height =new Stack<Integer>();
		Stack<Integer> pos =new Stack<Integer>();
		int[] start =new int[A.length];
		height.push(A[0]);
		pos.push(0);
		int i=1;
		while (i<A.length)
		{
			int h_val =height.pop();
			int p_val =pos.pop();
			while (A[i] >=h_val)
			{
				if (height.isEmpty())
					break;
				
				h_val =height.pop();
				p_val =pos.pop();
			}
			
			if (A[i] <h_val)
			{
				height.push(h_val);
				pos.push(p_val);
			}
			
			height.push(A[i]);
			pos.push(i);
			
			start[i] =p_val;
			i++;
		}
		
		i=A.length-1;
		int area =0;
		while (i >0)
		{
			int prev =start[i];
			int min =A[i];
			if (min >A[prev])
				min =A[prev];
			
			area +=min*(i-prev-1);
			int j=prev+1;
			while (j<i)
			{
				area -=A[j];
				j++;
			}
			
			i=prev;
		}
		
		return area;
	}

}
