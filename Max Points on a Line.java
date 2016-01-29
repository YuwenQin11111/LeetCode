import java.io.*;
import java.util.*;

class Point {
	int x;
	int y;
	Point() { x = 0; y = 0; }
	Point(int a, int b) { x = a; y = b; }

}

public class Solution {
	public int gcd(int a,int b)
	{
		if (b ==0) return a;
		
		return gcd(b, a%b);
		
	}
	
    public int maxPoints(Point[] points) {
    	if (points.length == 0)
    		return 0;
    	
    	int max_result;
    	int result =1;
    	for (int i=0; i<points.length; i++)
    	{
    		Map<String,Integer> collect =new HashMap<String,Integer>();
    		int numSame =1;
    		max_result =0;
    		for (int j=i+1; j<points.length; j++)
    		{
    			int diff_x =points[j].x - points[i].x;
    			int diff_y =points[j].y - points[i].y;
    			int g =gcd(diff_x, diff_y);
    			if (g!=0)
    			{
    				diff_x =diff_x/g;
    				diff_y =diff_y/g;
    			}
    			else
    			{
    				if (diff_x != 0)
    					diff_x =1;
    				else if(diff_y != 0)
    					diff_y =1;
    					
    				
    			}

    			String val =String.valueOf(diff_y)+" "+String.valueOf(diff_x);
    			if (diff_x ==0 && diff_y ==0)
    			{
    				numSame ++;
    				continue;
    			}
    			
    			int num =1;
    			if (collect.containsKey(val))
    			{
    					
    				num =collect.get(val)+1;
    			}
    				
    			
    			
    			collect.remove(val);
    			collect.put(val, num);
    			if (num>max_result)
    				max_result =num;
    		}
    		if (max_result+numSame >result)
    			result =max_result+numSame;
    		
    	}
    	return result;
    }
    
    public static void main(String args[])
    {
    	Solution sol =new Solution();
    	Point[] a=new Point[4];
    	a[0] =new Point(0,0);
    	a[1] =new Point(-1,-1);
    	a[2] =new Point(2,2);
    	a[3] =new Point(0,0);
    	int result =sol.maxPoints(a);
    	System.out.println(sol.gcd(3, 3));
    	System.out.println(result);
    	
    }
}
