public class Solution {
	public int uniquePaths(int m, int n) {
		m--;
		n--;
		if (m<n)
		{
			int temp =n;
			n=m;
			m=temp;
		}
		long val =1;
		int i=m+1;
		while (i<=m+n)
		{
			val =val*i;
			i++;
		}
		val =val/factor(n);
		return (int) val;
    }
	
	public long factor(int n)
	{
		long val =1;
		int i=1;
		while (i<=n)
		{
			val =val*i;
			i++;
		}
		return val;
	}
}
