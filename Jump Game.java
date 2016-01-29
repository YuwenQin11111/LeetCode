public class Solution {
	public boolean canJump(int[] A) {
		if (A.length <=1)
			return true;
		
		int max =0;
		int i=0;
		while (i<A.length)
		{
		    if (A[i] +i >max &&i<=max)
		        max =A[i]+i;
		        
		    i++;
		}
		if (max >=A.length-1)
		    return true;
		else
		    return false;
    }

}
