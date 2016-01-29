public class Solution {
	public String countAndSay(int n) {
		String s="1";
		int i=1;
		while (i<n)
		{
			String news ="";
			int count =1;
			char key =s.charAt(0);
			int j=1;
			while (j<s.length())
			{
				if (s.charAt(j) ==key)
				{
					count++;
				}
				else
				{
					char c=(char)(count+'0');
					news =news+String.valueOf(c);
					news =news+String.valueOf(key);
					count =1;
					key =s.charAt(j);
				}
				
				j++;
			}
			char c=(char)(count+'0');
			news =news+String.valueOf(c);
			news =news+String.valueOf(key);
			s=news;
			i++;
		}
		
		return s;
	}

}
