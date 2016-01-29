public class Solution {
	ArrayList<ArrayList<Integer>> result =new ArrayList<ArrayList<Integer>>();
	public ArrayList<ArrayList<Integer>> combinationSum2(int[] num, int target) {
		/* sort the candidate list */
		for (int i=0;i<num.length;i++)
		{
			for (int j=i+1;j<num.length;j++)
			{
				if (num[i] >num[j])
				{
					int temp =num[i];
					num[i] =num[j];
					num[j] =temp;
				}
				
			}
		}
		
		ArrayList<Integer> arr =new ArrayList<Integer>();
		combine(num,0,0,target,arr);
		
		return result;
	}
	
	public void combine(int[] candidates, int sum, int start, int target,ArrayList<Integer> arr)
	{
		if (sum ==target)
		{
			ArrayList<Integer> tmp =new ArrayList<Integer>(arr);
			if (!result.contains(tmp))
				result.add(tmp);
			return;
			
		}
		
		if (sum >target)
			return;
		
		if (start >=candidates.length)
			return;
		
		ArrayList<Integer> tmp =new ArrayList<Integer>(arr);
		tmp.add(candidates[start]);
		
		combine(candidates,sum+candidates[start],start+1,target,tmp);
		combine(candidates,sum,start+1,target,arr);
		
	}
}
