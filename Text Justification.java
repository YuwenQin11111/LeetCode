public class Solution {
	public ArrayList<String> fullJustify(String[] words, int L) {
		ArrayList<String> result =new ArrayList<String>();
		if (words.length ==0)
			return result;
		
		int cur =0;
		int prev =0;
		while (prev <words.length)
		{
			int word_len =0;
			int char_len =0;
			while (cur <words.length && word_len-1 <=L)
			{
				word_len +=words[cur].length()+1;
				char_len +=words[cur].length();
				cur++;
			
			}
		
			String tmp ="";
			
			if (cur ==words.length &&word_len -1 <=L)
			{
				for (int i=prev;i<cur;i++)
				{
					tmp +=words[i];
					if (i<cur-1)
						tmp +=" ";
				}
						
				
				while (tmp.length() <L)
					tmp +=" ";
				
			}
			else
			{
				if (cur -prev ==1)
				{
					char_len -=words[cur].length();
					tmp =addSpace(tmp,L-char_len);
					prev =cur;
				}
				else
				{
					char_len -=words[cur].length();
					int avg_space =(L-char_len)/(cur-prev);
					int left_space =(L-char_len)%(cur-prev);
					for (int i=prev;i<cur-1;i++)
					{
						tmp =addSpace(tmp,avg_space);
						if (left_space >0)
						{
							tmp +=" ";
							left_space--;
						}
					}
					tmp +=words[cur-1];
					while (left_space >0)
					{
						tmp +=" ";
						left_space--;
					}
					
					prev =cur;
				}
				
			}
			result.add(tmp);
		}
		
		return result;
	}
	
	public String addSpace(String s,int num)
	{
		String ret =s;
		for (int i=0;i<num;i++)
			ret +=" ";
		
		return ret;
	}

}
