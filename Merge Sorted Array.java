public class Solution {
	public void merge(int A[], int m, int B[], int n) { 
		int[] ans =new int[m+n];
		int i=0;
		int j=0;
		int k=0;
		while (i<m && j<n)
		{
			if (A[i] <B[j])
			{
				ans[k] =A[i];
				i++;
			}
			else
			{
				ans[k] =B[j];
				j++;
			}
			k++;
			
		}
		while (i<m)
		{
			ans[k++] =A[i];
			i++;
		}
		while (j<n)
		{
			ans[k++] =B[j];
			j++;
			
		}
		k=0;
		while (k<m+n)
		{
			A[k] =ans[k];
			k++;
		}
	}

}
