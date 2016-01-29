public class Solution {
	public ListNode deleteDuplicates(ListNode head) {
		if (head == null)
			return null;
		HashMap<Integer, Boolean> map =new HashMap<Integer,Boolean>();
		ListNode node =new ListNode(0);
		node.next =new ListNode(head.val);
		map.put(head.val, true);
		ListNode temp =node;
		head =head.next;
		node =node.next;
		while (head !=null)
		{
			if (!map.containsKey(head.val))
			{
				map.put(head.val, true);
				node.next =new ListNode(head.val);
				node =node.next;
			}
			head =head.next;
		}
		
		return temp.next;
    }

}
