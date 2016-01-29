public class Solution {
	public ListNode reverseKGroup(ListNode head, int k) {
		if (k <=1)
			return head;
		
		ListNode temp =new ListNode(0);
		//temp.next =head;
		ListNode a =new ListNode(0);
		ListNode[] arrnode =new ListNode[k];
		a.next =head;
		while (true)
		{
			ListNode b =a;
			int i=0;
			while (i<k)
			{
				if (b ==null)
					break;
				arrnode[i] =b.next;
				if (arrnode[i] ==null)
					break;
				b =b.next;
				i++;
			}
			
			if (i<k)
				break;
			
			ListNode nexttemp =arrnode[k-1].next;
			a.next =arrnode[k-1];
			if (temp.next ==null)
			{
				temp.next =a;
			}
			a =a.next;
			i=k-2;
			while (i>=0)
			{
				a.next =arrnode[i];
				i--;
				a=a.next;
			}
			a.next =nexttemp;
			a=a.next;
			
		}
		
		if (temp.next ==null)
		    return head;
		    
		return temp.next;
    }

}
