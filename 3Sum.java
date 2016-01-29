public class Solution {
	ArrayList<ArrayList<Integer>> result =new ArrayList<ArrayList<Integer>>();
	HashMap<Integer,Integer> map =new HashMap<Integer,Integer>();
	public ArrayList<ArrayList<Integer>> threeSum(int[] num) {
	    if (num.length <3)
	        return result;
	        
		quickSort(num,0,num.length-1);
		
		for (int i=0;i<num.length;i++)
		{
			if (map.containsKey(num[i]))
			{
				int val =map.get(num[i]);
				map.remove(num[i]);
				map.put(num[i], val+1);
			}
			else
			{
				map.put(num[i], 1);
			}
		}
		
		int i=0;
		while (i<num.length)
		{
			if (num[i] >0)
				break;
			int j =i+1;
			while (j<num.length)
			{
			        
				ArrayList<Integer> ans =new ArrayList<Integer>();
				ans.add(num[i]);
				ans.add(num[j]);
				int sum =num[i] +num[j];
				if (sum >0)
				    break;
				    
				sum =sum*(-1);
				if (sum <num[j])
				    break;
				if (map.containsKey(sum))
				{
					if (sum != num[j])
					{
						ans.add(sum);
						if (!result.contains(ans))
							result.add(ans);
					}
					else
					{
						if (map.get(sum) >2 || (map.get(sum) ==2&&num[i]!=0))
						{
							ans.add(sum);
							if (!result.contains(ans))
								result.add(ans);
							
						}
					}
				}
				
				int k=j+1;
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
