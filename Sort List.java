import java.io.*;
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
	
	public ListNode sortList(ListNode head) {
		if (head ==null)
			return null;
		
		//System.out.println(head.val);
		
		if (head.next == null)
		{
			return head;
		}
		
        ListNode list =new ListNode(Integer.MIN_VALUE);
        int length =0;
        ListNode temp =head;
        while (temp != null)
        {
        	length+=1;
        	temp =temp.next;
        }
		
        ListNode firsttemp =new ListNode(Integer.MIN_VALUE);
        ListNode ftemp =null;
        temp =head;
        int i=0;
        while (i<length/2)
        {
        	i +=1;
        	firsttemp.next =new ListNode(temp.val);
        	if (i ==1)
        		ftemp =firsttemp.next;
        	firsttemp =firsttemp.next;
        	temp =temp.next;
        }
        
        ListNode nexttemp =temp;
        if (i ==0)
        	return head;

        ListNode sortedfirst =sortList(ftemp);
        ListNode sortedsecond =sortList(nexttemp);
        /*
        while (sortedfirst!=null)
        {
        	System.out.println(sortedfirst.val);
        	sortedfirst =sortedfirst.next;
        }
        
        while (sortedsecond!=null)
        {
        	System.out.println(sortedsecond.val);
        	sortedsecond =sortedsecond.next;
        }
        */
        
        ListNode tlist=null;
        while (sortedfirst!=null && sortedsecond!=null)
        {
       
        	if (sortedfirst.val <sortedsecond.val)
        	{
        		list.next=new ListNode(sortedfirst.val);
        		sortedfirst =sortedfirst.next;
        	}
        	else
        	{
        		list.next=new ListNode(sortedsecond.val);
        		sortedsecond =sortedsecond.next;
        	}
        	if (tlist == null)
        		tlist =list.next;
        	
        	list =list.next;
        	
        }
        
        while (sortedfirst !=null)
        {
        	//System.out.println(sortedfirst.val);
        	list.next=new ListNode(sortedfirst.val);
        	if (tlist == null)
        		tlist =list.next;
        	
        	list =list.next;
        	sortedfirst =sortedfirst.next;
        }
        
        while (sortedsecond !=null)
        {
        	
        	list.next=new ListNode(sortedsecond.val);
        	if (tlist == null)
        		tlist =list.next;
        	
        	list =list.next;
        	sortedsecond =sortedsecond.next;
        }
        
		return tlist;
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
    	ListNode list =sol.sortList(temp);
    	
    	while (list != null)
    	{
    		System.out.println(list.val);
    		list =list.next;
    	}
    	
    }
}
