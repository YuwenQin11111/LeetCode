public class Solution {
	public TreeNode buildTree(int[] preorder, int[] inorder) {
		if (inorder.length ==0)
			return null;
		
		if (inorder.length ==1)
		{
			TreeNode node =new TreeNode(inorder[0]);
			return node;
		}
		
		int val =preorder[0];
		int pos =0;
		while (pos <inorder.length)
		{
			if (inorder[pos] ==val)
				break;
			
			pos++;
		}
		
		TreeNode node =new TreeNode(val);
		
		if (pos>0)
		{
			int[] leftinorder =new int[pos];
			int[] leftpreorder =new int[pos];
			int i=0;
			while (i<pos)
			{
				leftinorder[i] =inorder[i];
				leftpreorder[i] =preorder[i+1];
				i++;
			}
		
			node.left =buildTree(leftpreorder,leftinorder);
		}
		else
			node.left =null;
		
		if (pos+1<preorder.length)
		{
			int[] rightinorder =new int[preorder.length-pos-1];
			int[] rightpreorder =new int[preorder.length-pos-1];
			int i=0;
			while (i+pos+1<preorder.length)
			{
				rightinorder[i] =inorder[i+pos+1];
				rightpreorder[i] =preorder[i+pos+1];
				i++;
			}
		
			node.right =buildTree(rightpreorder,rightinorder);
		}
		else
			node.right =null;
		
		return node;
    }
}
