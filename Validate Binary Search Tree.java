public class Solution {
    public boolean isValidBST(TreeNode root) {
        return judgeTree(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
        
    }
    public boolean judgeTree(TreeNode root ,int min, int max)
    {
        if (root ==null)
            return true;
            
        if (root.val <=min ||root.val >=max)
            return false;
        
        int leftmax =max;
        if (leftmax >root.val)
            leftmax =root.val;
        
        if (!judgeTree(root.left,min,leftmax))
            return false;
            
        int rightmin =min;
        if (rightmin <root.val)
            rightmin =root.val;
            
        if (!judgeTree(root.right,rightmin,max))
            return false;
            
        return true;
        
    }
    
}
