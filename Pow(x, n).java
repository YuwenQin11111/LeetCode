public class Solution {
	public double pow(double x, int n) {
		if (n==0)
			return 1;
		
		if (n<0)
		{
			if (n !=Integer.MIN_VALUE)
				return 1/pow(x,n*(-1));
			else
				return 1/(x*pow(x,Integer.MAX_VALUE));
		}
		
		double val =1;
		double mod =x;
		while (n>0)
		{
			if (n%2 ==1)
				val *=mod;
			
			mod =mod*x;
			n=n/2;
			//System.out.println(val);
		}
		
		return val;
    }

}
