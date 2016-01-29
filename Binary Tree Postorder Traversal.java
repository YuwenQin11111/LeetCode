import java.io.*;
import java.util.*;

class TreeNode 
{
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int x) { val = x; }
}


public class Solution {
   public ArrayList<Integer> postorderTraversal(TreeNode root) {
       ArrayList<Integer> result =new ArrayList<Integer>();
	   Stack<TreeNode> tree =new Stack<TreeNode>();
	   tree.push(root);
	   while (tree.empty() == false)
	   {
		   TreeNode node =tree.pop();
		   result.add(node.val);
		   if (node.left != null)
			   tree.push(node.left);
		   
		   if (node.right != null)
			   tree.push(node.right);
		   
	   }
	   ArrayList<Integer> ret_list =new ArrayList<Integer>();
	   for (int i=0;i<result.size();i++)
	   {
		   ret_list.add(result.get(result.size()-1-i));
	   }
	   return ret_list;
	   
   }

   
	
   public static void main(String args[])
   {
    	Solution sol =new Solution();
    	
    }
}
