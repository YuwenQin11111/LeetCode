public class Solution {
	public int[][] generateMatrix(int n) {
		int[][] matrix =new int[n][n];
		int num=1;
		int m=n;
		
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
				matrix[size][j] =num++;
				j++;
			}
			j=1+size;
			while (j<m-size)
			{
				matrix[j][n-size-1] =num++;
				j++;
			}
			j=n-size-2;
			while (j >=size)
			{
				matrix[m-size-1][j] =num++;
				j--;
			}
			j=m-size-2;
			while (j >size)
			{
				matrix[j][size] =num++;
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
					matrix[j][size] =num++;
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
					matrix[size][j] =num++;
					j++;
				}
			}
		}
		return matrix;
		
    }

}
