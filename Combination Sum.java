public class Solution {
	ArrayList<ArrayList<Integer>> result =new ArrayList<ArrayList<Integer>>();
	public ArrayList<ArrayList<Integer>> combinationSum(int[] candidates, int target) {
		/* sort the candidate list */
		for (int i=0;i<candidates.length;i++)
		{
			for (int j=i+1;j<candidates.length;j++)
			{
				if (candidates[i] >candidates[j])
				{
					int temp =candidates[i];
					candidates[i] =candidates[j];
					candidates[j] =temp;
				}
				
			}
		}
		
		ArrayList<Integer> arr =new ArrayList<Integer>();
		combine(candidates,0,0,target,arr);
		
		return result;
	}
	
	public void combine(int[] candidates, int sum, int start, int target,ArrayList<Integer> arr)
	{
		if (sum ==target)
		{
			ArrayList<Integer> tmp =new ArrayList<Integer>(arr);
			result.add(tmp);
			return;
			
		}
		
		if (sum >target)
			return;
		
		if (start >=candidates.length)
			return;
		
		ArrayList<Integer> tmp =new ArrayList<Integer>(arr);
		tmp.add(candidates[start]);
		combine(candidates,sum+candidates[start],start,target,tmp);
		combine(candidates,sum,start+1,target,arr);
		
	}

}
