public class Solution {
	public int removeDuplicates(int[] A) {
		if (A.length <=2)
			return A.length;
		
		int len =A.length;
		int sum =0;
		HashMap<Integer,Integer> map =new HashMap<Integer,Integer>();
		for (int i=0;i<len;i++)
		{
			if (map.containsKey(A[i]))
			{
				int val =map.get(A[i]);
				map.remove(A[i]);
				if (val ==1)
				{
					val ++;
					sum++;
				}
				map.put(A[i],val);
			}
			else
			{
				map.put(A[i], 1);
				sum++;
			}
		}
		
		return sum;
    }

}
