public class Solution {
    public int sumNumbers(TreeNode root) {
        int sum =ret_sum(root,0,0);
        
        
        return sum;
    }
    
    int ret_sum(TreeNode root,int current_sum,int tot_sum)
    {
        if (root ==null)
            return tot_sum;
        
        if (root.left ==null && root.right ==null)
            return (tot_sum +current_sum*10+root.val);
        
        
        int ret_val =tot_sum;
        if (root.left != null)
            ret_val =ret_sum(root.left,current_sum*10+root.val,tot_sum);
            
        if (root.right != null)
            ret_val =ret_sum(root.right,current_sum*10+root.val,ret_val);
        
        return ret_val;
    }
    
}
