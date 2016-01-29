public class Solution {
	ArrayList<ArrayList<Integer>> result =new ArrayList<ArrayList<Integer>>();
	public ArrayList<ArrayList<Integer>> pathSum(TreeNode root, int sum) {
    	if (root ==null)
    		return result;
    	
    	ArrayList<Integer> path =new ArrayList<Integer>();
    	pathgen(root,sum,path);
    	
    	return result;
    }
	
	public void pathgen(TreeNode node, int sum, ArrayList<Integer> path)
	{
		if (node.left == null && node.right ==null)
		{
			path.add(node.val);
			int suma=0;
			for (int i=0;i<path.size();i++)
			{
				suma +=path.get(i);
				
			}
			if (suma ==sum)
				result.add(path);
			return;	
		}
		path.add(node.val);
		if (node.left!=null)
		{
			pathgen(node.left,sum,path);
			path.remove(path.size()-1);
		}
		
		if (node.right!=null)
		{
			pathgen(node.right,sum,path);
			path.remove(path.size()-1);
		}
	}

}
