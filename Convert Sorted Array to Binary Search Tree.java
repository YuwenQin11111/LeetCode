/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public TreeNode sortedArrayToBST(int[] num) {
        return sortedArrayToBST(num,0,num.length-1);
    }
    
    private TreeNode sortedArrayToBST(int[] num, int start, int end){
        if(start ==end){
            return (new TreeNode(num[start]));
        }else if(start >end){
            return null;
        }

        int mid =(start+end)/2;
        
        TreeNode node = new TreeNode(num[mid]);
        node.left = sortedArrayToBST(num, start, mid-1);
        node.right = sortedArrayToBST(num,mid+1,end);
        
        return node;
    }
}
