public class Solution {
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		if (l1 ==null)
			return l2;
		
		if (l2 ==null)
			return l1;
		
		ListNode result =new ListNode(0);
		if (l1.val<l2.val)
		{
			result.next =l1;
			l1 =l1.next;
		}
		else
		{
			result.next =l2;
			l2 =l2.next;
		}
		
		ListNode ret =result;
		ret =ret.next;
		while (l1 !=null &&l2!=null)
		{
			if (l1.val <l2.val)
			{
				ret.next =l1;
				ret =ret.next;
				l1 =l1.next;
			}
			else
			{
				ret.next =l2;
				ret =ret.next;
				l2 =l2.next;
			}
			
		}
		
		while (l1 !=null)
		{
			ret.next =l1;
			ret =ret.next;
			l1 =l1.next;
		}
		
		while (l2 !=null)
		{
			ret.next =l2;
			ret =ret.next;
			l2 =l2.next;
		}
		
		return result.next;
    }

}
