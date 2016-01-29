public class Solution {
	ArrayList<ArrayList<Integer>> result =new ArrayList<ArrayList<Integer>>();
	public ArrayList<ArrayList<Integer>> levelOrderBottom(TreeNode root) {
		visitNode(root,0);
		ArrayList<ArrayList<Integer>> newresult =new ArrayList<ArrayList<Integer>>();
		for (int i=0;i<result.size();i++)
		{
			newresult.add(result.get(result.size()-i-1));
		}
		return newresult;
	}
	
	public void visitNode(TreeNode node, int depth)
	{
		if (node == null)
			return;
		
		if (result.size() ==depth)
		{
			ArrayList<Integer> list =new ArrayList<Integer>();
			list.add(node.val);
			result.add(list);
		}
		else
		{
			result.get(depth).add(node.val);
		}
		visitNode(node.left,depth+1);
		visitNode(node.right,depth+1);
	}

}
