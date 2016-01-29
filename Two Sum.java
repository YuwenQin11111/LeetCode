public class Solution {
	public int[] twoSum(int[] numbers, int target) {
		HashMap<Integer,Integer> map =new HashMap<Integer,Integer>();
		int[] ans =new int[2];
		for (int i=0;i<numbers.length;i++)
		{
			int val = target-numbers[i];
			if (map.containsKey(val))
			{
				ans[0] =map.get(val)+1;
				ans[1] =i+1;
				return ans;
			}
			else
			{
				map.put(numbers[i], i);
			}
		}
		return ans;
    }
}
