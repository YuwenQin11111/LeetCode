public class Solution {
    public double findMedianSortedArrays(int A[], int B[]) {
    	int mid;
    	if (A.length ==0)
    	{
    		if (B.length %2 ==0)
    		{
    			mid =(B.length-1)/2;
    			double val =(B[mid]+B[mid+1]);
    			val =val/2;
    			return val;
    		}
    		else
    		{
    			mid =(B.length-1)/2;
    			return B[mid];
    		}
    	}
    	
    	if (B.length ==0)
    	{
    		if (A.length %2 ==0)
    		{
    			mid =(A.length-1)/2;
    			double val =(A[mid]+A[mid+1]);
    			val =val/2;
    			return val;
    		}
    		else
    		{
    			mid =(A.length-1)/2;
    			return A[mid];
    		}
    	}
    	
    	double ret_val;
        int start_a =0;
        int end_a =A.length-1;
    	int start_b =0;
    	int end_b =B.length-1;
    	while (true)
    	{
    		if (start_a ==end_a)
    		{
    			if ((end_b -start_b+1) %2 ==0)
    			{
    				int mid_b =(start_b+end_b)/2;
    				if (A[start_a] <B[mid_b])
    					return B[mid_b];
    				
    				else if (A[start_a] >B[mid_b+1])
    					return B[mid_b+1];
    				
    				else return A[start_a];
    			}
    			
    			else
    			{
    				if ((end_b -start_b+1) ==1)
    				{
    					ret_val =A[start_a] +B[start_b];
    					return ret_val/2;
    				}
    				
    				int val_a =A[start_a];
    				int mid_b =(start_b+end_b)/2;
    				int val_b =B[mid_b];
    				if (A[start_a] >B[mid_b+1])
    					val_a =B[mid_b+1];
    				else if (A[start_a] <B[mid_b-1])
    					val_a =B[mid_b-1];
    				
    				ret_val =val_a +val_b;
    				ret_val/=2;
    				return ret_val;
    				
    			}
    		}
    		
    		if (start_b ==end_b)
    		{
    			if (start_b ==end_b)
        		{
        			if ((end_a -start_a+1) %2 ==0)
        			{
        				int mid_a =(start_a+end_a)/2;
        				if (B[start_b] <A[mid_a])
        					return A[mid_a];
        				
        				else if (B[start_b] >A[mid_a+1])
        					return A[mid_a+1];
        				
        				else return B[start_b];
        			}
        			
        			else
        			{
        				if ((end_a -start_a+1) ==1)
        				{
        					ret_val =B[start_b] +A[start_a];
        					return ret_val/2;
        				}
        				
        				int val_a =B[start_b];
        				int mid_a =(start_a+end_a)/2;
        				int val_b =A[mid_a];
        				if (B[start_b] >A[mid_a+1])
        					val_a =A[mid_a+1];
        				else if (B[start_b] <A[mid_a-1])
        					val_a =A[mid_a-1];
        				
        				ret_val =val_a +val_b;
        				ret_val/=2;
        				return ret_val;
        				
        			}
        		}
    		}
    		
    		if (end_a-start_a ==1 &&(end_b -start_b)%2 ==1)
    		{
    			int mid_b =(start_b +end_b)/2;
    			if (A[start_a] >B[mid_b] &&A[end_a] <B[mid_b+1])
    			{
    				ret_val =A[start_a] +A[end_a];
    				ret_val /=2;
    				return ret_val;
    				
    			}
    			
    		}
    		if (end_b-start_b ==1 &&(end_a -start_a)%2 ==1)
    		{
    			int mid_a =(start_a +end_a)/2;
    			if (B[start_b] >A[mid_a] &&B[end_b] <A[mid_a+1])
    			{
    				ret_val =B[start_b] +B[end_b];
    				ret_val /=2;
    				return ret_val;
    			}
    			
    		}
    		
    		int mid_a =(start_a + end_a)/2;
    		int mid_b =(start_b + end_b)/2;
    		
    		if (A[mid_a] ==B[mid_b])
    		{
    			if ((end_a -start_a+1)%2 ==0)
    			{
    				if ((end_b -start_b+1)%2 ==0)
    				{
    					ret_val =A[mid_a];
    					if (A[mid_a+1] >B[mid_b+1])
    						ret_val +=B[mid_b+1];
    					else
    						ret_val +=A[mid_a+1];
    					
    					ret_val /=2;
    					return ret_val;
    				}
    				else
    				{
    					return B[mid_b];
    				}
    			}
    			else
    			{
    				if ((end_b -start_b+1)%2 ==0)
    				{
    					return A[mid_a];
    				}
    				else
    				{
    					ret_val =A[mid_a]+B[mid_b];
    					ret_val/=2;
    					return ret_val;
    				}
    				
    			}
    		}
    		
    		
    		if (A[mid_a] >B[mid_b])
    		{
    			int len;
    			
    			if ((end_b -start_b) >(end_a-start_a))
    				len =(end_a-start_a)/2;
    			else
    				len =(end_b-start_b)/2;
    			
    			if (len ==0)
    				len =1;
    			//System.out.println(len);
    			end_a =end_a -len;
    			start_b =start_b +len;
    		}
    		else
    		{
    			int len;
    			if ((end_a -start_a) >(end_b -start_b))
    				len =(end_b -start_b)/2;
    			else
    				len =(end_a -start_a)/2;
    			
    			//System.out.println(len);
    			if (len ==0)
    				len =1;
    			end_b =end_b -len;
    			start_a =start_a +len;
    		}
    	}
    	
    }
}
