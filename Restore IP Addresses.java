public class Solution {
	ArrayList<String> result =new ArrayList<String>();
	public ArrayList<String> restoreIpAddresses(String s) {
		generateResult(s,0,"");
		
		return result;
	}
	
	public void generateResult(String s, int start, String ip)
	{
		if (s ==null)
		{
			if (start ==4 &&!result.contains(ip))
				result.add(ip);
			return;
		}
		
		if (s.length() ==0 &&!result.contains(ip))
		{
			if (start ==4)
				result.add(ip);
			return;
		}
		
		if (start ==4 &&s.length() !=0)
			return;
		
		if (start ==3)
		{
			if (s.length() >3)
				return;
			if (Integer.valueOf(s) >255)
				return;
		}
		
		String last_ch ="";
		if (start !=3)
			last_ch =".";
		
		for (int i=0;i<3;i++)
		{
			if (i+1 >s.length())
				break;
			String substr =s.substring(0,i+1);
			int val =Integer.valueOf(substr);
			if (val >255)
				break;
			if (substr.equals(String.valueOf(val)))
				generateResult(s.substring(i+1,s.length()),start+1,ip+String.valueOf(val)+last_ch);
		}
	}

}
