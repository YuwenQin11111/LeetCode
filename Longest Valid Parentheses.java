public class Solution {
	public int longestValidParentheses(String s) {
		if (s.length() ==0)
			return 0;
		Stack<Integer> st =new Stack<Integer>();
		
		int max =0;
		int len =0;
		if (s.charAt(0) =='(')
			st.push(0);
		
		int i=1;
		int[] arr =new int[s.length()];
		while (i<s.length())
		{
			if (s.charAt(i) =='(')
			{
				st.push(i);
			}
			else
			{
				if (!st.isEmpty())
				{
					int prev =st.pop();
					int prev_len =0;
					if (prev-1 >=0)
						prev_len =arr[prev-1];
					
					if (i-prev+1+prev_len >max)
						max =i-prev+1+prev_len;
					
					arr[i] =i-prev+1+prev_len;
				}
				else
				{
					
					
				}
			}
			i++;
		}
		return max;
    }

}
