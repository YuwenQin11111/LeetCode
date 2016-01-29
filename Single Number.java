public class Solution {
	public int singleNumber(int[] A) {
		int count[] =new int[34];
		for (int i=0;i<A.length;i++)
		{
			Long val =new Long(A[i]);
			if (val<0)
			{
				val =val*(-1);
				count[33]++;
			}
			
			int ind =0;
			while (val >0)
			{
				count[ind] +=val%2;
				val =val/2;
				ind ++;
			}
			
		}
		
		int num =0;
		int ind=0;
		int pow =1;
		while (ind <32)
		{
			if (count[ind]%2 ==1)
			{
				num+=pow;
			}
			pow =pow*2;
			ind ++;
		}
		if (count[33]%2 ==1)
			num =num*(-1);
		
		return num;
	}
	
}
