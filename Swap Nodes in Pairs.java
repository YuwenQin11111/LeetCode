public class Solution {
	public ListNode swapPairs(ListNode head) {
		ListNode temp =new ListNode(0);
		//temp.next =head;
		ListNode a =temp;
		a.next =head;
		while (true)
		{
			ListNode a1 =a.next;
			if (a1 ==null)
				break;
			
			ListNode a2 =a1.next;
			if (a2 ==null)
				break;
			
			a1.next =a2.next;
			a2.next =a1;
			a.next =a2;
			if (temp.next ==null)
			{
				temp.next =a;
			}
			
			a= a1;
		}
		
		return temp.next;
    }

}
