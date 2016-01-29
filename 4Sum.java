public class Solution {
	ArrayList<ArrayList<Integer>> result =new ArrayList<ArrayList<Integer>>();
	HashMap<Integer,Integer> map =new HashMap<Integer,Integer>();
	public ArrayList<ArrayList<Integer>> fourSum(int[] num, int target) {
	    if (num.length <4)
	        return result;
	        
		quickSort(num,0,num.length-1);
		
		int i=0;
		while (i<num.length)
		{
			int j =i+1;
			while (j<num.length)
			{
			    int k=j+1;
			    int l=num.length-1;
			    while (k<l)
			    {
			    	int sum=num[i]+num[j]+num[k]+num[l];
			    	if (sum ==target)
			    	{
			    		ArrayList<Integer> arr =new ArrayList<Integer>();
			    		arr.add(num[i]);
			    		arr.add(num[j]);
			    		arr.add(num[k]);
			    		arr.add(num[l]);
			    		if (!result.contains(arr))
			    			result.add(arr);
			    		k++;
			    		l--;
			    	}
			    	else
			    	{
			    		if (sum >target)
			    			l--;
			    		else
			    			k++;
			    		
			    	}
			    		
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
			j =i+1;
			while (j<num.length)
			{
			    if (num[j] !=num[i])
			        break;
			    j++;
			}
			
			i=j;
		}
		return result;
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
