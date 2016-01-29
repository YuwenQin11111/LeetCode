public class Solution {
    public ArrayList<ArrayList<String>> partition(String s) 
    {
    	ArrayList<ArrayList<String>> ret_array =new ArrayList<ArrayList<String>>();

    	boolean[][] pal =new boolean[s.length()+1][s.length()+1];
		
		for (int i=0;i<s.length();i++)
		{
			pal[i][i] =true;
			pal[i+1][i] =true;
		}
		
		for (int l =1;l<s.length();l++)
		{
			for (int i=0;i<s.length()-l;i++)
			{
				if (pal[i+1][i+l-1] ==false)
					pal[i][i+l]=false;
				
				else
				{
					if (s.charAt(i) ==s.charAt(i+l))
						pal[i][i+l] =true;
					
					else
						pal[i][i+l] =false;
				}
			}
			
		}
		
		ret_array =generatearray(s,pal,0);
		
		return ret_array;
    	
    }

    ArrayList<ArrayList<String>> generatearray(String s,boolean[][] pal,int start)
    {
    	ArrayList<ArrayList<String>> ret_array =new ArrayList<ArrayList<String>>();
    	if (start ==s.length())
    		return ret_array;
    	
    	for (int i=start;i<s.length();i++)
    	{
    		if (pal[start][i])
    		{
    			ArrayList<ArrayList<String>> sub_array =generatearray(s,pal,i+1);
    			for (int j=0;j<sub_array.size();j++)
    			{
    				ArrayList<String> tmp =new ArrayList<String>();
    				tmp.add(s.substring(start,i+1));
    				for (int k=0;k<sub_array.get(j).size();k++)
    				{
    					tmp.add(sub_array.get(j).get(k));
    					
    				}
    				ret_array.add(tmp);
    			}
    			
    			if (i ==s.length()-1)
    			{
    				ArrayList<String> one_array =new ArrayList<String>();
    				one_array.add(s.substring(start,i+1));
    				ret_array.add(one_array);
    			}
    			
    		}
    		
    	}
    	return ret_array;
    }

	
	public static void main(String args[])
	{
    	Solution sol =new Solution();
    	
    	int[] a=new int[1];
    	a[0]=1;
    	/*
    	a[1]=0;
    	a[2]=0;
    	a[3]=1;
    	a[4]=1;
    	a[5]=1;
    	a[6]=99;
    	*/
    	//int result =sol.singleNumber(a);
    	//System.out.println(result);
    	
    	ArrayList<ArrayList<String>> ret_array=sol.partition("aab");
    	for (int i=0;i<ret_array.size();i++)
    		System.out.println(ret_array.get(i));
    	
	}
}
