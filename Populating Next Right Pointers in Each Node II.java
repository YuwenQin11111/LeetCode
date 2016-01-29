public class Solution {
    public void connect(TreeLinkNode root) {
    	if (root ==null)
    		return;
    	
    	
    	
    	if (root.right!=null)
    	{
    	    TreeLinkNode node =root;
    	    while (node.next!=null)
    	    {
    	        if (root.right.next!=null)
    	            break;
    	            
    		    if (node.next.right!=null)
    			    root.right.next =node.next.right;
    		
    		    if (node.next.left!=null)
    			    root.right.next =node.next.left;
    			    
    			node =node.next;
    	    }
    	    
    	}
    	
    	
    	if (root.right !=null)
    		connect(root.right);
    		
    	if (root.left !=null)
    	{
    		if (root.right != null)
     		    root.left.next =root.right;
     		
    		else
    		{
    		    TreeLinkNode node =root;
    			while (node.next!=null)
    			{
    			    if (root.left.next!=null)
    			        break;
    			    
    				if (node.next.right !=null)
    					root.left.next =node.next.right;
    				
    				if (node.next.left !=null)
    					root.left.next =node.next.left;
    					
    				node =node.next;
    			}
    		}
    	}
    	
    	if (root.left !=null)
    		connect(root.left);
    	
    }
    
}
