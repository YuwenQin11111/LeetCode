public class Solution {
	public void nextPermutation(int[] num) {
		int[] tmp =new int[num.length];
		int i=num.length-1;
		int j=0;
		while (i-1 >=0)
		{
			if (num[i] >num[i-1])
				break;
			
			tmp[j++] =num[i];
			i--;
		}
		
		int len =j;
		if (i ==0)
		{
			j =0;
			while (j<num.length/2)
			{
				int temp =num[j];
				num[j] =num[num.length-j-1];
				num[num.length-j-1] =temp;
				j++;
				
			}
			return;
			
		}
		
		int min =num[i];
		int ind =i;
		j=i;
		while (j<num.length)
		{
			if (min >num[j] &&num[i] <num[j])
			{
				min =num[j];
				ind =i;
			}
			
			j++;
		}
		
		num[ind] =num[i-1];
		num[i-1] =min;
		
		j=i+1;
		while (j<num.length)
		{
			int k=j+1;
			while (k<num.length)
			{
				if (num[j] >num[k])
				{
					int temp =num[j];
					num[j] =num[k];
					num[k] =temp;
				}
				k++;
				
			}
			j++;
			
		}
    }

}
