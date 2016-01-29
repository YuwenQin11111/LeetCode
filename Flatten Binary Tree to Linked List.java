public class Solution {
	ArrayList<Integer> list =new ArrayList<Integer>();
	public void flatten(TreeNode root) {
		if (root == null)
			return;
		
		visit(root);
		TreeNode node =new TreeNode(list.get(0));
		if (list.size()>1)
		{
			node.left =null;
			node.right =new TreeNode(list.get(1));
		}
		root =node;
		node =node.right;
		for (int i=2;i<list.size();i++)
		{
			node.left =null;
			node.right =new TreeNode(list.get(i));
			node =node.right;
		}
	}
	
	public void visit(TreeNode node)
	{
		if (node ==null)
			return;
		
		list.add(node.val);
		visit(node.left);
		visit(node.right);
		
	}

}
