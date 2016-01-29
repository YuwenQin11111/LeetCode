public class Solution {
	public String addBinary(String a, String b) {
		int len =a.length()+1;
		if (len <b.length()+1)
			len =b.length()+1;
		
		int[] arr_a =new int[len];
		int[] arr_b =new int[len];
		for (int i=0;i<len;i++)
		{
			arr_a[i] =0;
			arr_b[i] =0;
		}
		
		for (int i=a.length()-1;i>=0;i--)
			arr_a[a.length()-1-i] =(int)(a.charAt(i)-'0');
		
		for (int i=b.length()-1;i>=0;i--)
			arr_b[b.length()-1-i] =(int)(b.charAt(i)-'0');
		
		String result ="";
		int add =0;
		for (int i=0;i<len;i++)
		{
			add=add+arr_a[i]+arr_b[i];
			if (add%2 ==1)
				result ="1"+result;
			else
				result ="0"+result;
			add =add/2;
		}
		
		int ind =0;
		while (ind <len-1)
		{
			if (result.charAt(ind) !='0')
				break;
			ind++;
		}
		return result.substring(ind,result.length());
    }
}public class Solution {
	public String addBinary(String a, String b) {
		int len =a.length()+1;
		if (len <b.length()+1)
			len =b.length()+1;
		
		int[] arr_a =new int[len];
		int[] arr_b =new int[len];
		for (int i=0;i<len;i++)
		{
			arr_a[i] =0;
			arr_b[i] =0;
		}
		
		for (int i=a.length()-1;i>=0;i--)
			arr_a[a.length()-1-i] =(int)(a.charAt(i)-'0');
		
		for (int i=b.length()-1;i>=0;i--)
			arr_b[b.length()-1-i] =(int)(b.charAt(i)-'0');
		
		String result ="";
		int add =0;
		for (int i=0;i<len;i++)
		{
			add=add+arr_a[i]+arr_b[i];
			if (add%2 ==1)
				result ="1"+result;
			else
				result ="0"+result;
			add =add/2;
		}
		
		int ind =0;
		while (ind <len-1)
		{
			if (result.charAt(ind) !='0')
				break;
			ind++;
		}
		return result.substring(ind,result.length());
    }
}
