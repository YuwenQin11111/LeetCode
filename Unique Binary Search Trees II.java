public class Solution {
	public ArrayList<TreeNode> generateTrees(int n) {
       return generateTree(n,1,n);
       
    }
	
	public ArrayList<TreeNode> generateTree(int n, int min, int max)
	{
		 ArrayList<TreeNode> result =new ArrayList<TreeNode>();
		 if (n ==0)
		 {
			TreeNode node =null;
			result.add(node);
			return result;
		 }
		 
	     int i=0;
	     while (i<n)
	     {
	        ArrayList<TreeNode> left =generateTree(i,min,i+min);
	        int a_min =min;
	        if (a_min <i+1+min)
	        	a_min =i+1+min;
	        
	        ArrayList<TreeNode> right =generateTree(n-i-1,a_min,max);
	        if (left.size() ==0 && right.size() ==0)
	        {
	        	TreeNode root =new TreeNode(1);
	        	result.add(root);
	        	break;
	        }
	        else if (left.size() ==0)
	        {
	        	int j=0;
	        	while (j<right.size())
	        	{
	        		TreeNode root =new TreeNode(i+min);
	        		root.right=right.get(j);
	        		result.add(root);
	        		j++;
	        	}
	        	
	        }
	        else if (right.size() ==0)
	        {
	        	int j=0;
	        	while (j<left.size())
	        	{
	        		TreeNode root =new TreeNode(i+min);
	        		root.left =left.get(j);
	        		result.add(root);
	        		j++;
	        	}
	        }
	        else
	        {
	        	int j=0;
	        	while (j<left.size())
	        	{
	        		int k=0;
	        		while (k<right.size())
	        		{
	        			TreeNode root =new TreeNode(i+min);
	        			root.left =left.get(j);
	        			root.right =right.get(k);
	        			result.add(root);
	        			k++;
	        		}
	        		j++;
	        	}
	        	
	        }
	        i++;
	     }
	     return result;
	}
	
}
