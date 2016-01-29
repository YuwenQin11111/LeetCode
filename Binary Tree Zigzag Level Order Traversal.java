public class Solution {
	ArrayList<ArrayList<Integer>> result =new ArrayList<ArrayList<Integer>>();
	public ArrayList<ArrayList<Integer>> zigzagLevelOrder(TreeNode root) {
		visitNode(root,0);
		ArrayList<ArrayList<Integer>> newresult =new ArrayList<ArrayList<Integer>>();
		boolean reverse =false;
		for (int i=0;i<result.size();i++)
		{
			ArrayList<Integer> list =new ArrayList<Integer>();
			if (reverse ==true)
			{
				int len =result.get(result.size()-i-1).size();
				int j=0;
				while (j<len)
				{
					list.add(result.get(result.size()-i-1).get(len-j-1));
					j++;
				}
			}
			else
				list =result.get(result.size()-i-1);
			
			newresult.add(list);
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
