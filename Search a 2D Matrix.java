public class Solution {
	public boolean searchMatrix(int[][] matrix, int target) {
		int m =matrix.length;
		if (m ==0)
			return false;
		
		int n =matrix[0].length;
		if (n ==0)
			return false;
		
		int start =0;
		int end =m*n-1;
		while (start <=end)
		{
			int mid =(start+end)/2;
			int x=mid%n;
			int y=mid/n;
			if (matrix[y][x] ==target)
				return true;;
			
			if (matrix[y][x] <target)
				start =mid+1;
			else
				end =mid-1;
		}
		
		return false;
	}
}
