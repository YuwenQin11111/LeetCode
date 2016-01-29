public class Solution {
	public ArrayList<Integer> getRow(int rowIndex) {
		
		ArrayList<Integer> frow =new ArrayList<Integer>();
		if (rowIndex <0)
			return frow;
		
		frow.add(1);
		ArrayList<Integer> srow =frow;
		int i=1;
		while (i<=rowIndex)
		{
			ArrayList<Integer> nrow =new ArrayList<Integer>();
			nrow.add(srow.get(0));
			int j=1;
			while (j<i)
			{
				nrow.add(srow.get(j-1)+ srow.get(j));
				j++;
			}
			nrow.add(srow.get(i-1));
			srow =nrow;
			i++;
		}
		
		return srow;
    }
}
