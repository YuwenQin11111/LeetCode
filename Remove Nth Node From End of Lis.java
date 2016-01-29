public class Solution {
	public ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode a =head;
		ListNode b =head;
		int t =n;
		while (a !=null)
		{
			a =a.next;
			t--;
			if (t<0)
				b =b.next;
			
		}
		if (b ==head)
			return head.next;
		else
		{
			b.next =b.next.next;
		}
		return head;
    }

}
