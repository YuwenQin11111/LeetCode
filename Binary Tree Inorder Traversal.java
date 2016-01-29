public class Solution {
	public ArrayList<Integer> inorderTraversal(TreeNode root) {
		Stack<TreeNode> q =new Stack<TreeNode>();
		ArrayList<Integer> result =new ArrayList<Integer>();
		if (root == null)
			return result;
		
		q.push(root);
		while (!q.isEmpty())
		{
			TreeNode node =q.pop();
			if (node.left ==null && node.right ==null)
				result.add(node.val);
			else if (node.left ==null)
			{
				q.push(node.right);
				node.right =null;
				q.push(node);
			}
			else if (node.right ==null)
			{
			    TreeNode left =node.left;
			    node.left =null;
			    q.push(node);
				q.push(left);
			}
			else
			{
				q.push(node.right);
				TreeNode right =node.left;
				node.left =null;
				node.right =null;
				q.push(node);
				q.push(right);
			}
		}
		
		return result;
	}
}
