public class Solution {
	public boolean isValid(String s) {
		if (s.length() == 0)
			return true;
		
		Stack<Character> stack =new Stack<Character>();
		char ch =s.charAt(0);
		if (ch ==']' ||ch =='}' ||ch ==')')
			return false;
		
		stack.add(s.charAt(0));
		int i=1;
		while (i<s.length())
		{
			ch =s.charAt(i);
			if (ch =='[' ||ch =='{' || ch =='(')
			{
				stack.add(ch);
			}
			else
			{
				if (stack.empty())
					return false;
				char topch =stack.pop();
				if (ch ==']')
				{
					if (topch !='[')
						return false;
				}
				else if (ch =='}')
				{
					if (topch !='{')
						return false;
				}
				else if (ch ==')')
				{
					if (topch !='(')
						return false;
					
				}
			}
			
			i++;
		}
		
		if (!stack.isEmpty())
			return false;
		
		return true;
    }

}
