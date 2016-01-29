public class Solution {
	public String getPermutation(int n, int k) {
		boolean[] vis =new boolean[10];
		int[] fact =new int[10];
		fact[1] =1;
		int i=1;
		while (i<9)
		{
			fact[i+1] =fact[i]*i;
			i++;
		}
		String result ="";
		i=n;
		while (i>=1)
		{
			int num =(k-1)/fact[i]+1;
			k=k-(num-1)*fact[i];
			for (int j=1;j<=num;j++)
			{
				if (vis[j])
					num++;
			}
			
			vis[num] =true;
			result +=String.valueOf(num);
			i--;
		}
		
		return result;
		
    }
}
