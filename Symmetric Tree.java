public class Solution {
	public boolean isSymmetric(TreeNode root) {
	    if (root ==null)
	        return true;
	        
		TreeNode rightnode =reverse(root.right);
		TreeNode leftnode =root.left;
		
		return sameTree(rightnode,leftnode);
	}
	
	public TreeNode reverse(TreeNode node)
	{
		if (node ==null)
			return null;
		
		TreeNode newnode =new TreeNode(node.val);
		newnode.left =reverse(node.right);
		newnode.right =reverse(node.left);
		return newnode;
	}

	public boolean sameTree(TreeNode left, TreeNode right)
	{
		if (left ==null && right ==null)
			return true;
		
		if (left ==null && right !=null)
			return false;
		
		if (left !=null && right ==null)
			return false;
		
		if (left.val !=right.val)
			return false;
		
		if (!sameTree(left.left,right.left))
			return false;
		
		if (!sameTree(left.right,right.right))
			return false;
		
		return true;
		
	}

}
