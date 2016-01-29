public class Solution {
	public ListNode deleteDuplicates(ListNode head) {
		if (head ==null)
			return null;
		
		HashMap<Integer,Boolean> map =new HashMap<Integer,Boolean>();
		ListNode temp =head;
		while (temp !=null)
		{
			if (map.containsKey(temp.val))
			{
				map.remove(temp.val);
				map.put(temp.val, false);
			}
			else
				map.put(temp.val, true);
			
			temp =temp.next;
		}
		
		ListNode node =new ListNode(0);
		temp =head;
		while (temp !=null)
		{
			if (map.get(temp.val) ==true)
				break;
			
			temp =temp.next;
		}
		
		if (temp ==null)
			return null;
		
		node.next =new ListNode(temp.val);
		ListNode ret =node;
		node =node.next;
		temp =temp.next;
		while (temp !=null)
		{
			if (map.get(temp.val) ==false)
			{
				temp =temp.next;
				continue;
			}
			node.next =new ListNode(temp.val);
			node =node.next;
			temp =temp.next;
		}
		
		return ret.next;
    }

}
