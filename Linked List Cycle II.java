class ListNode 
{
	int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class Solution {
	public ListNode detectCycle(ListNode head) {
		HashSet hash =new HashSet();
		while (head!=null)
		{
			if (hash.contains(head))
				return head;
			
			hash.add(head);
			head =head.next;
		}
		
		return null;
	}
}
