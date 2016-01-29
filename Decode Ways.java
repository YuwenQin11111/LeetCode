public class Solution {
	Map<String,Integer> hashmap =new HashMap<String, Integer>();
	public int numDecodings(String s) {
		if (s ==null)
			return 0;
		
		if (hashmap.containsKey(s))
			return hashmap.get(s);
		
		if (s.length() ==0)
			return 0;
		
		if (s.charAt(0) =='0')
		{
			hashmap.put(s, 0);
			return 0;
		}
		
		if (s.length() ==1)
		{
			hashmap.put(s, 1);
			return 1;
		}
		
		if (s.length() ==2)
		{
			int val;
			if (Integer.valueOf(s) >26)
				val =1;
			else
			{
			    if (Integer.valueOf(s) ==10 ||Integer.valueOf(s) ==20)    
			        val =1;
			    else
				    val =2;
			}
			hashmap.put(s, val);
			return val;
		}
			
		
		int num =0;
		for (int i=0;i<2;i++)
		{
			if (i+1 >=s.length())
				break;
			if (i ==0)
				num +=numDecodings(s.substring(i+1,s.length()));
			else
				num +=(numDecodings(s.substring(0,i+1))-1)*numDecodings(s.substring(i+1,s.length()));
		}
		
		hashmap.put(s,num);
		return num;
		
	}

}
