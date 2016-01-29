public class Solution {
	public boolean isBalanced(TreeNode root) {
    	if (root == null)
    		return true;
    	
    	if (!isBalanced(root.left))
    		return false;
    	
    	if (!isBalanced(root.right))
    		return false;
    	
    	int lval =0;
    	int rval =0;
    	if (root.left !=null)
    		lval =root.left.val;
    	
    	if (root.right !=null)
    		rval =root.right.val;
    	
    	if (lval-rval >=2 || lval-rval <=-2)
    		return false;
    	
    	return true;
    }
}
