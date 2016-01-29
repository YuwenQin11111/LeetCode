public class Solution {
	public ListNode rotateRight(ListNode head, int n) {
		if (head ==null)
			return null;
		
		ListNode first=head;
		int len=0;
		int i=0;
		while (first !=null)
		{
			first =first.next;
			len++;
		}
		n =n%len;
		if (n ==0)
			return head;
		
		first =head;
		while (i<n)
		{
			first =first.next;
			i++;
		}
		ListNode second =head;
		while (first !=null)
		{
			second =second.next;
			first =first.next;
		}
		ListNode result =second;
		ListNode temp =second;
		while (second.next!=null)
		{
			second =second.next;
		}
		first =head;
		while (!first.equals(temp))
		{
			second.next =first;
			if (result.next ==null)
				result =second;
			
			second =second.next;
			first =first.next;
		}
		second.next =null;
		return result;
    }
}
