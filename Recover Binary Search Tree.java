/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
	TreeNode cur =null;
	TreeNode pre =null;
	TreeNode err1 =null;
	TreeNode err2 =null;
	TreeNode err3 =null;
	public void recoverTree(TreeNode root) {
		if (root ==null)
			return;
		
		FindErr(root);
		
		if (err1 !=null &&err2 !=null)
		{
			int tempval =err1.val;
			err1.val=err2.val;
			err2.val=tempval;
		}
		
		else if (err1 !=null &&err3 !=null)
		{
			int tempval =err1.val;
			err1.val=err3.val;
			err3.val=tempval;
		}
    }
	
	public void FindErr(TreeNode node)
	{
		if (node == null)
			return;
		
		FindErr(node.left);
		
		if (cur ==null)
			cur =node;
		else
		{
			pre =cur;
			cur =node;
		}
		
		if (cur!=null && pre!=null)
		{
			if (cur.val <pre.val)
			{
				if (err1 ==null)
				{
					err1 =pre;
					err3 =cur;
				}
				else
					err2 =cur;
			}
		}
			
		FindErr(node.right);
		
	}
}
