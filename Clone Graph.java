import java.io.*;
import java.util.*;

class UndirectedGraphNode {
   int label;
   ArrayList<UndirectedGraphNode> neighbors;
   UndirectedGraphNode(int x) { label = x; neighbors = new ArrayList<UndirectedGraphNode>(); }
};


public class Solution {
	   public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) 
		   {
			   if (node ==null)
				   return null;
			   
			   HashMap<Integer,UndirectedGraphNode> nodemap =new HashMap<Integer,UndirectedGraphNode>();
			   LinkedList<UndirectedGraphNode> q =new LinkedList<UndirectedGraphNode>();
			   UndirectedGraphNode head =null;
			   q.add(node);
			   head =new UndirectedGraphNode(node.label);
			   nodemap.put(head.label, head);
			   while (!q.isEmpty())
			   {
				   UndirectedGraphNode newnode =q.poll();
				   UndirectedGraphNode copynode =nodemap.get(newnode.label);
				   Iterator<UndirectedGraphNode> iter = newnode.neighbors.iterator();
		           while(iter.hasNext())
		           {
		               UndirectedGraphNode neighbor =iter.next();
					   if (nodemap.containsKey(neighbor.label))
					   {
						   copynode.neighbors.add(nodemap.get(neighbor.label));
						   
					   }
					   else
					   {
						   UndirectedGraphNode nnode =new UndirectedGraphNode(neighbor.label);
						   nodemap.put(neighbor.label, nnode);
						   q.add(neighbor);
						   copynode.neighbors.add(nodemap.get(neighbor.label));
					   }
					   
					   
				   }
				   
			   }
			   
			   return head;
			   
		   }
		

	
	public static void main(String args[])
	{
    	Solution sol =new Solution();
    	
    	int[] a=new int[1];
    	a[0]=1;
    	/*
    	a[1]=0;
    	a[2]=0;
    	a[3]=1;
    	a[4]=1;
    	a[5]=1;
    	a[6]=99;
    	*/
    	//int result =sol.singleNumber(a);
    	//System.out.println(result);
    	
	}
}
