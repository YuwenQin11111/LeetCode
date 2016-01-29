public class Solution {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		long a =num(l1);
		long b =num(l2);
		long res =a+b;
		ListNode ans =generate(res);
		
		return ans;
    }
    
	public long num(ListNode l)
	{
		if (l ==null)
			return 0;
		
		return num(l.next)*10 +l.val;
	}
    
	public ListNode generate(long ans)
	{
		if (ans <10)
		{
			ListNode res =new ListNode((int)(ans));
			return res;
		}
		
		long a =ans %10;
		long b =ans /10;
		ListNode res =new ListNode((int)(a));
		res.next =generate(b);
		return res;
		
	}

}
