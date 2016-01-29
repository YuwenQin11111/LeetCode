public class Solution {
	ArrayList<ArrayList<Integer>> ans =new ArrayList<ArrayList<Integer>>();
	public ArrayList<ArrayList<Integer>> combine(int n, int k) {
		ArrayList<Integer> tmp = new ArrayList<Integer>();
		int i=1;
		while (i<=n-k+1)
		{
			tmp.add(i);
			dfs(i+1,tmp,k-1,n);
			tmp.remove(tmp.size()-1);
			i++;
		}
		
		return ans;
		
    }
	
	public void dfs(int start,ArrayList<Integer> arr, int num,int n)
	{
		ArrayList<Integer> tmp = new ArrayList<Integer>(arr);
		if (num ==0)
		{
			ans.add(tmp);
		    return;
		}
		
		int i =start;
		while (i<=n-num+1)
		{
			arr.add(i);
			dfs(i+1,arr,num-1,n);
			arr.remove(arr.size()-1);
			i++;
		}
	}
}
