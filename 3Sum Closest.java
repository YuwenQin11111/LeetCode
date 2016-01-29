public class Solution {
	public int threeSumClosest(int[] num, int target) {
	    quickSort(num,0,num.length-1);
		int min =Integer.MAX_VALUE;
		int ans =0;
		int i=0;
		while (i<num.length)
		{
			int j=i+1;
			while (j<num.length)
			{
				int k=j+1;
				while (k<num.length)
				{
					int sum =num[i]+num[j]+num[k];
					if (Math.abs(sum-target) <min)
					{
						ans =sum;
						min =Math.abs(sum-target);
					}
					
					int l =k+1;
					while (l<num.length)
					{
						if (num[l] !=num[k])
							break;
						
						l++;
					}
					
					k=l;
				}
				
				k=j+1;
				while (k<num.length)
				{
					if (num[k] !=num[j])
						break;
					
					k++;
				}
				j=k;
			}
			
			j=i+1;
			while (j<num.length)
			{
				if (num[j] !=num[i])
					break;
				
				j++;
			}
			i=j;
		}
		
		return ans;
    }
	
	public void quickSort(int[] num, int start, int end)
	{
		if (end <= start)
			return;
		
		int mid =(start+end)/2;
		int val =num[mid];
		int i=start;
		int temp =val;
		num[mid] =num[end];
		num[end] =temp;
		int index =start;
		while (i <end)
		{
			if (num[i] <val)
			{
				temp =num[index];
				num[index] =num[i];
				num[i] =temp;
				index++;
			}
			
			i++;
		}
		temp =num[index];
		num[index] =num[end];
		num[end] =temp;
		
		quickSort(num,start,index-1);
		quickSort(num,index+1,end);
	}

}
