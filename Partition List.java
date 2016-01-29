public class Solution {
	public ListNode partition(ListNode head, int x) {
		if (head == null)
			return null;
		
		ArrayList<Integer> low =new ArrayList<Integer>();
		ArrayList<Integer> high =new ArrayList<Integer>();
		ListNode pointer =head;
		while (pointer !=null)
		{
			if (pointer.val <x)
				low.add(pointer.val);
			else
				high.add(pointer.val);
			pointer =pointer.next;
			
		}
		ListNode node =new ListNode(0);
		ListNode temp =new ListNode(0);
		if (low.size() !=0)
		{
			node.next =new ListNode(low.get(0));
			temp =node;
			node =node.next;
			int i=1;
			while (i<low.size())
			{
				node.next =new ListNode(low.get(i));
				node =node.next;
				i++;
			}
		}
		
		if (high.size() !=0)
		{
			int i=0;
			if (low.size() ==0)
			{
				node.next =new ListNode(high.get(0));
				temp =node;
				node =node.next;
				i=1;
			}
			
			while (i<high.size())
			{
				node.next =new ListNode(high.get(i));
				node =node.next;
				i++;
			}
		}
	
		return temp.next;
	}
}
