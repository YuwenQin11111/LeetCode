public class Solution {
	public int jump(int[] A) {
		if (A.length <=1)
			return 0;
		
		int[] visit =new int[A.length];
		Queue<Integer> q =new LinkedList<Integer>();
		q.add(0);
		while (!q.isEmpty())
		{
			int ele =q.poll();
			if (ele ==A.length-1)
				return visit[ele];
			
			int i=A[ele];
			while (i>=1)
			{
			    if (i+ele >=A.length)
			    {
			        i--;
			        continue;
			    }
				if (visit[ele+i] ==0)
				{
					visit[ele+i] =visit[ele] +1;
					q.add(ele+i);
					if (ele+i ==A.length-1)
					    return visit[ele+i];
				}
				
				i--;
			}
			
		}
	
		return Integer.MAX_VALUE;
    }
}
