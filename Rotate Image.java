public class Solution {
	public void rotate(int[][] matrix) {
		int len =matrix.length;
		if (len <=1)
			return;
		if (len %2 ==1)
		{
			for (int i=0;i<len/2;i++)
			{
				for (int j =0;j<(len+1)/2;j++)
				{
					int x =i-len/2;
					int y =j-len/2;
					int val_a =matrix[x+len/2][y+len/2];
					int val_b =matrix[len/2+y][len/2-x];
					int val_c =matrix[len/2-x][len/2-y];
					int val_d =matrix[len/2-y][len/2+x];
					matrix[x+len/2][y+len/2] =val_d;
					matrix[len/2+y][len/2-x] =val_a;
					matrix[len/2-x][len/2-y] =val_b;
					matrix[len/2-y][len/2+x] =val_c;
				}
			}
		}
		else
		{
			for (int i=0;i<len/2;i++)
			{
				for (int j =0;j<(len+1)/2;j++)
				{
					int x =i-len/2;
					int y =j-len/2;
					int val_a =matrix[x+len/2][y+len/2];
					int val_b =matrix[len/2+y][len/2-x-1];
					int val_c =matrix[len/2-x-1][len/2-y-1];
					int val_d =matrix[len/2-y-1][len/2+x];
					matrix[x+len/2][y+len/2] =val_d;
					matrix[len/2+y][len/2-x-1] =val_a;
					matrix[len/2-x-1][len/2-y-1] =val_b;
					matrix[len/2-y-1][len/2+x] =val_c;
				}
			}

			
			
		}
		
    }

}
