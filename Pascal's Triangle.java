public class Solution {
	public ArrayList<ArrayList<Integer>> generate(int numRows) {
		ArrayList<ArrayList<Integer>> result =new ArrayList<ArrayList<Integer>>();
		if (numRows ==0)
			return result;
		
		ArrayList<Integer> frow =new ArrayList<Integer>();
		frow.add(1);
		result.add(frow);
		int i=1;
		while (i<numRows)
		{
			ArrayList<Integer> nrow =new ArrayList<Integer>();
			nrow.add(result.get(i-1).get(0));
			int j=1;
			while (j<i)
			{
				nrow.add(result.get(i-1).get(j-1)+result.get(i-1).get(j));
				j++;
			}
			nrow.add(result.get(i-1).get(i-1));
			result.add(nrow);
			i++;
		}
		
		return result;
    }
}
