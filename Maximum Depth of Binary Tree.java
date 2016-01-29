public class Solution {
    int max =0;
    public int maxDepth(TreeNode root) {
        traversal(root,0);
        return max;
    }
    public void traversal(TreeNode node,int depth)
    {
        if (max<depth)
            max =depth;
        
        if (node ==null)
            return;
            
        traversal(node.left,depth+1);
        traversal(node.right,depth+1);
    }
}
