import java.io.*;
import java.util.*;

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
	public void reorderList(ListNode head) {
    
		if (head == null)
			return;
		
		int length =0;
		ListNode header =head;
		while (header != null)
		{
			length ++;
			header =header.next;
			
		}
		ListNode tempheader =head;
		header =tempheader;
		ListNode ret_head =header;
		int i =0;
		while (i <(length-1)/2)
		{
			//System.out.println(tempheader.val);
			i++;
			tempheader =tempheader.next;
		}
		
		ListNode nextheader =tempheader.next;
		tempheader.next =null;
		ArrayList<Integer> temparray=new ArrayList<Integer>();
		while (nextheader != null)
		{
			temparray.add(nextheader.val);
			nextheader =nextheader.next;
			
		}
		
		
		i=temparray.size()-1;
		while (i>=0)
		{
			//System.out.println(nextheader.val);
			ListNode newnode =new ListNode(temparray.get(i));
			newnode.next=header.next;
			header.next =newnode;
			i--;
			header=newnode.next;
		}

		head =ret_head;
	}

   
	
   public static void main(String args[])
   {
    	Solution sol =new Solution();
    	ListNode list =new ListNode(1);
    	list.next =new ListNode(2);
    	ListNode head =list;
    	list =list.next;
    	list.next =new ListNode(3);
    	sol.reorderList(head);
    	while (head !=null)
    	{
    		System.out.println(head.val);
    		head =head.next;
    		
    	}
   }
}
