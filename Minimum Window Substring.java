public class Solution {
	public String minWindow(String S, String T) {
		int[] count1 =new int[256];
		int[] count2 =new int[256];
		int count =0;
		for (int i=0;i<T.length();i++)
		{
			count1[T.charAt(i)-' ']=0;
			count2[T.charAt(i)-' ']++;
		}
		
		int min =S.length();
		String substr ="";
		int start =0;
		int end =0;
		while (true)
		{
			if (count <T.length())
			{
				while (end <S.length())
				{
					if (count2[S.charAt(end)-' '] ==0)
					{
						end++;
						continue;
					}
					
					if (count1[S.charAt(end)-' '] <count2[S.charAt(end)-' '])
					{
						count++;
					}
					count1[S.charAt(end)-' ']++;
					if (count ==T.length())
						break;
					
					end++;
				}
			}
			
			if (count<T.length() &&end ==S.length())
				break;
			
			while (start <S.length())
			{
				int val =S.charAt(start)-' ';
				if (count2[val] >0)
				{
					if (count1[val] ==count2[val])
					{
						break;
					}
					
					count1[val]--;
					
				}
				start++;
			}
			
			if (min >=end-start+1)
			{
				min =end-start+1;
				substr =S.substring(start,end+1);
			}
			
			count1[S.charAt(start)-' ']--;
			count--;
			start++;
			end++;
			if (end >S.length()-1)
			    break;
		}
		
		return substr;
    }

}
