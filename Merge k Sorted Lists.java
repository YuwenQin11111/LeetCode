public class Solution {
	public ListNode mergeKLists(ArrayList<ListNode> lists) {
		if (lists.size() ==0)
			return null;
		
		ListNode result =new ListNode(0);
		ListNode temp =result;
		while (true)
		{
			int min =Integer.MAX_VALUE;
			int ind =-1;
			int end =0;
			for (int i=0;i<lists.size();i++)
			{
				if (lists.get(i) !=null)
				{
					end =1;
					if (min >lists.get(i).val)
					{
						min =lists.get(i).val;
						ind =i;
						
					}
					
				}
			}
			if (end ==0)
				break;
			
			ListNode node =new ListNode(min);
			ListNode indnode =lists.remove(ind);
			lists.add(indnode.next);
			if (temp.next ==null)
			{
				result.next =node;
				temp =result;
				result =result.next;
			}
			else
			{
				result.next =node;
				result =result.next;
			}
		}
		return temp.next;
    }

}
