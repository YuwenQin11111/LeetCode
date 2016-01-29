public class Solution {
	public String convert(String s, int nRows) {
		if (s.length() <=1)
	        return s;
	        
	    if (nRows ==1)
	        return s;
	    
	    
		char[] ans =new char[s.length()];
		if (nRows ==2)
		{
			int i=0;
			String val ="";
			while (i<s.length())
			{
				val +=s.charAt(i);
				i +=2;
			}
			
			i=1;
			while (i<s.length())
			{
				val +=s.charAt(i);
				i +=2;
			}
			
			return val;
		}
		int len =nRows*2 -2;
		int i=0;
		int pos=0;
		while (pos<s.length())
		{
			ans[i++] =s.charAt(pos);
			pos +=len;
		}
		int numRow =1;
		while (numRow<nRows -1)
		{
			int pos_l =numRow;
			int pos_r =2*nRows-numRow-2;
			while (pos_l<s.length())
			{
				ans[i++] =s.charAt(pos_l);
				if (pos_r >=s.length())
					break;
				
				ans[i++] =s.charAt(pos_r);
				pos_l +=len;
				pos_r +=len;
			}
			numRow++;
		}
		pos =nRows-1;
		while (pos<s.length())
		{
			ans[i++] =s.charAt(pos);
			pos +=len;
		}
		String val ="";
		i =0;
		while (i<s.length())
		{
			val +=ans[i];
			i++;
		}
		return val;
    }
}
