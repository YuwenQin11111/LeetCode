public class Solution {
	public ArrayList<Integer> findSubstring(String S, String[] L) {
		ArrayList<Integer> result =new ArrayList<Integer>();
		if (L.length ==0)
			return result;
		
		Map<String,Integer> wordcount =new HashMap<String,Integer>();
		Map<String,Integer> currcount =new HashMap<String,Integer>();
		
		
		for (int i=0;i<L.length;i++)
		{
			if (wordcount.containsKey(L[i]))
			{
				int val =wordcount.remove(L[i]);
				wordcount.put(L[i], val +1);
			}
			else
				wordcount.put(L[i],1);
			
		}
		
		for (int i=0;i<S.length();i++)
		{
			currcount.clear();
			int j=0;
			while (j<L.length &&(i+(j+1)*L[0].length()<S.length()))
			{
				String substr =S.substring(i+j*L[0].length(),i+(j+1)*L[0].length());
				if (!wordcount.containsKey(substr))
					break;
				
				if (currcount.containsKey(substr))
				{
					int val =currcount.get(substr);
					if (val >=wordcount.get(substr))
						break;
					
					currcount.remove(substr);
					currcount.put(substr,val+1);
				}
				else
				{
					currcount.put(substr, 1);
				}
				
				j++;
			}
			
			if (j>=L.length)
				result.add(i);
			
		}
		
		return result;
    }
}
