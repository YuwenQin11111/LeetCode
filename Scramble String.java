public class Solution {
	HashMapString, Boolean map =new HashMapString,Boolean();
	public boolean isScramble(String s1, String s2) {
		if (s1.length() != s2.length())
			return false;
			
		if (s1.equals(s2))
		    return true;
		
		if (map.containsKey(s1+s2))
			return map.get(s1+s2);
		
		if (map.containsKey(s2+s1))
			return map.get(s2+s1);
		
		if (s1.length() ==1)
			return s1.equals(s2);
		
		if (s1.length() ==2)
		{
			boolean val;
			if (s1.charAt(0) ==s2.charAt(1) &&s1.charAt(1) ==s2.charAt(0))
				val =true;
			else
				val =false;
			map.put(s1+s2, val);
			map.put(s2+s1, val);
			return val;
		}
		
		int i=0;
		if (s1.length() =5)
		{
			int[] occur1 =new int[26];
			int[] occur2 =new int[26];
			while (is1.length())
			{
				occur1[s1.charAt(i)-'a']++;
				occur2[s2.charAt(i)-'a']++;
				i++;
			}
			i=0;
			while (i26)
			{
				if (occur1[i] !=occur2[i])
					return false;
				i++;
			}
		}
		
		i =0;
		while (is1.length()-1)
		{
			String presubstr1 =s1.substring(0,i+1);
			String subsubstr1 =s1.substring(i+1,s1.length());
			String presubstr2 =s2.substring(0,i+1);
			String subsubstr2 =s2.substring(i+1,s1.length());
			boolean scramble1 =isScramble(presubstr1, presubstr2);
			boolean scramble2 =isScramble(subsubstr1, subsubstr2);
			if (scramble1 && scramble2)
			{
				map.put(s1+s2, true);
				map.put(s2+s1, true);
				return true;
			}
			if (scramble1 && subsubstr1.equals(subsubstr2))
			{
				map.put(s1+s2, true);
				map.put(s2+s1, true);
				return true;
			}
			if (scramble2 && presubstr1.equals(presubstr2))
			{
				map.put(s1+s2, true);
				map.put(s2+s1, true);
				return true;
			}
			subsubstr1 =s1.substring(0,s1.length()-i-1);
			presubstr1 =s1.substring(s1.length()-i-1,s1.length());
			scramble1 =isScramble(presubstr1, presubstr2);
			scramble2 =isScramble(subsubstr1, subsubstr2);
			if (scramble1 && scramble2)
			{
				map.put(s1+s2, true);
				map.put(s2+s1, true);
				return true;
			}
			if (scramble1 && subsubstr1.equals(subsubstr2))
			{
				map.put(s1+s2, true);
				map.put(s2+s1, true);
				return true;
			}
			if (scramble2 && presubstr1.equals(presubstr2))
			{
				map.put(s1+s2, true);
				map.put(s2+s1, true);
				return true;
			}
			
			i++;
		}
		
		map.put(s1+s2, false);
		map.put(s2+s1, false);
		return false;
	}
	
}
