public class Solution {
	public ArrayList<Integer> spiralOrder(int[][] matrix) {
		ArrayList<Integer> result =new ArrayList<Integer>();
		int m =matrix.length;
		if (m ==0)
			return result;
		
		int n =matrix[0].length;
		if (n ==0)
			return result;
		
		int dir =0;
		int size =0;
		int mm =m;
		int nn =n;
		if (mm%2 ==1)
		    mm--;
		    
		if (nn%2 ==1)
		    nn--;
		
		while (size <mm/2 && size <nn/2)
		{
			int j=size;
			while (j <n-size)
			{
				result.add(matrix[size][j]);
				j++;
			}
			j=1+size;
			while (j<m-size)
			{
				result.add(matrix[j][n-size-1]);
				j++;
			}
			j=n-size-2;
			while (j >=size)
			{
				result.add(matrix[m-size-1][j]);
				j--;
			}
			j=m-size-2;
			while (j >size)
			{
				result.add(matrix[j][size]);
				j--;
			}
			size++;
		}
		
		if (m >n)
		{
			if ( n %2 !=0)
			{
				int j=size;
				while (j<m-size)
				{
					result.add(matrix[j][size]);
					j++;
				}
			}
			
		}
		else
		{
			if (m%2 !=0)
			{
				int j=size;
				while (j<n-size)
				{
					result.add(matrix[size][j]);
					j++;
				}
			}
		}
		return result;
		
    }

}
