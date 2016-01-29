public class Solution {
	public void setZeroes(int[][] matrix) {
		int m=matrix.length;
		if (m ==0)
			return;
		
		int n=matrix[0].length;
		if (n==0)
			return;
		
		boolean zerocol =false;
		boolean zerorow =false;
		for (int i=0;i<n;i++)
		{
			if (matrix[0][i] ==0)
				zerorow =true;
		}
		
		for (int i=0;i<m;i++)
		{
			if (matrix[i][0] ==0)
				zerocol =true;
		}
		
		int size =1;
		
		while (size<m &&size<n)
		{
			int j=size;
			while (j<n)
			{
				if (matrix[0][j] ==0)
					matrix[size][j] =0;
				
				if (matrix[size][j] ==0)
				{
					for (int k=size-1;k>=0;k--)
						matrix[k][j] =0;
				}
				
				j++;
			}
			
			j=size+1;
			while (j<m)
			{
				if (matrix[j][0] ==0)
					matrix[j][size] =0;
				
				if (matrix[j][size] ==0)
				{
					for (int k=size-1;k>=0;k--)
						matrix[j][k] =0;
				}
				
				j++;
			}
			
			size++;
		}
		
		for (int i=0;i<5;i++)
    	{
    		for (int j=0;j<4;j++)
    		{
    			System.out.print(matrix[i][j]);
    		}
    		System.out.println();
    	}
		
		size =1;
		while (size <m)
		{
		    if (matrix[size][0] ==0)
		    {
		        int j=0;
		        while (j<n)
		        {
		            matrix[size][j] =0;
		            j++;
		        }
		    }
		    
		    size++;
		}
		
		size =1;
		while (size <n)
		{
		    if (matrix[0][size] ==0)
		    {
		        int j=0;
		        while (j<m)
		        {
		            matrix[j][size] =0;
		            j++;
		        }
		    }
		    
		    size++;
		}
		if (zerorow)
		{
			for (int i=0;i<n;i++)
				matrix[0][i] =0;
		}
		
		if (zerocol)
		{
			for (int i=0;i<m;i++)
				matrix[i][0] =0;
			
		}
	}

}
