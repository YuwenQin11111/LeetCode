import java.util.*;

class ListNode {
	int val;
	ListNode next;
	ListNode(int x) {
		val = x;
		next = null;
	}
}

public class Solution {
	public ListNode insertionSortList(ListNode head) {
		ListNode header =new ListNode(Integer.MIN_VALUE);
		header.next=head;
		header =header.next;
		ListNode newhead =new ListNode(Integer.MIN_VALUE);
		if (header != null)
		{
			newhead.next =new ListNode(header.val);
			header =header.next;
		}
		ListNode rethead =newhead;
		
		while (header !=null)
		{
			int val =header.val;
			ListNode pointer =rethead;
			ListNode npointer =rethead.next;
			
			while (npointer != null)
			{
				if (val >=npointer.val)
					break;
				pointer =pointer.next;
				npointer =npointer.next;
				
			}
			if (npointer == null)
			{
				newhead.next =new ListNode(val);
				newhead =newhead.next;
			}
			else
			{
				pointer.next=new ListNode(val);
				pointer.next.next =npointer;
			}
			header =header.next;
			
		}
		return rethead.next;
	}

	
    public static void main(String args[])
    {
    	Solution sol =new Solution();
    	ListNode head=new ListNode(2);
    	ListNode temp =head;
    	head.next =new ListNode(1);
    	head=head.next;
    	head.next =new ListNode(0);
    	head=head.next;
    	head.next =new ListNode(5);
    	ListNode list =sol.insertionSortList(temp);
    	
    	while (list != null)
    	{
    		System.out.println(list.val);
    		list =list.next;
    	}
    	
    }
}
