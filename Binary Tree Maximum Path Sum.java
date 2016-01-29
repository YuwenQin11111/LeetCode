public class Solution {
	public int maxSum =Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
    	if (root ==null)
    		return 0;
    	
        int num =searchNode(root);
        
        return maxSum;
    }

	public int searchNode(TreeNode node){
		if (node.left == null && node.right==null)
		{
			if (maxSum<node.val)
				maxSum =node.val;

			return node.val;
		}
		int leftMax =0;
		if (node.left !=null)
			leftMax =searchNode(node.left);
		
		int rightMax =0;
		if (node.right !=null)
			rightMax =searchNode(node.right);
		
		int Max =node.val;
		
		if (rightMax >0)
			Max +=rightMax;
			
		if (leftMax >0)
			Max +=leftMax;
		
		if (Max >maxSum)
			maxSum =Max;
			
		Max =node.val;
		if (rightMax>leftMax &&rightMax>0)
            Max +=rightMax;
            
        if (leftMax>rightMax &&leftMax>0)
            Max +=leftMax;

		return Max;
	}

}
