public class Solution {
	public int divide(int dividend, int divisor) {
		if (divisor ==0)
			return 0;
		
		long divid =(long) dividend;
		if (divid <0)
			divid =divid*(-1);
		
		//System.out.println(divid);
		long divis =(long) divisor;
		if (divis <0)
			divis =divis*(-1);
		
		//System.out.println(divis);
		int neg =0;
		if ((dividend <0 && divisor >0)||(dividend >0&&divisor<0))
			neg =1;
		
		long num =0;
		int i=31;
		long div =(1<<30);
		div =div+div;
		//System.out.println(div);
		while (i>=0)
		{
			if (divid >=(long)(div*divis))
			{
				//System.out.println(div);
				num +=div;
				divid =divid-div*divis;
			}
			div =div/2;
			i--;
		}
		
		if (neg ==1)
			num =num*(-1);
		
		return (int)num;
		
    }

}
