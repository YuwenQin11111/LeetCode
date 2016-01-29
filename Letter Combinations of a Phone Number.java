public class Solution {
	ArrayList<String> result =new ArrayList<String>();
	String[] list =new String[10];
	
	public ArrayList<String> letterCombinations(String digits) {
		list[0] ="";
		list[1] ="";
		list[2] ="abc";
		list[3] ="def";
		list[4] ="ghi";
		list[5] ="jkl";
		list[6] ="mno";
		list[7] ="pqrs";
		list[8] ="tuv";
		list[9] ="wxyz";
		generateString(digits,"");
		return result;
		
    }

	public void generateString(String digits, String str)
	{
		if (digits.length() ==0)
		{
			String temp =new String(str);
			result.add(temp);
			return;
		}
		
		int val =digits.charAt(0) -'0';
		for (int i=0;i<list[val].length();i++)
		{
			generateString(digits.substring(1,digits.length()),(str+list[val].charAt(i)));
		}
	}
}
