public class Solution {
	public TreeNode buildTree(int[] inorder, int[] postorder) {
	    
	    
		if (inorder.length ==0)
			return null;
		
		if (inorder.length ==1)
		{
			TreeNode node =new TreeNode(inorder[0]);
			return node;
		}
		
		int val =postorder[postorder.length-1];
		int pos =0;
		while (pos <inorder.length)
		{
			if (inorder[pos] ==val)
				break;
			
			pos++;
		}
		
		TreeNode node =new TreeNode(val);
		if (pos ==inorder.length)
		    return node;
		    
		if (pos>0)
		{
			int[] leftinorder =new int[pos];
			int[] leftpostorder =new int[pos];
			int i=0;
			while (i<pos)
			{
				leftinorder[i] =inorder[i];
				leftpostorder[i] =postorder[i];
				i++;
			}
		
			node.left =buildTree(leftinorder,leftpostorder);
		}
		else
			node.left =null;
		
		if (pos+1<postorder.length)
		{
			int[] rightinorder =new int[postorder.length-pos-1];
			int[] rightpostorder =new int[postorder.length-pos-1];
			int i=0;
			while (i+pos+1<postorder.length)
			{
				rightinorder[i] =inorder[i+pos+1];
				rightpostorder[i] =postorder[i+pos];
				i++;
			}
		
			node.right =buildTree(rightinorder,rightpostorder);
		}
		else
			node.right =null;
		
		return node;
    }

}
