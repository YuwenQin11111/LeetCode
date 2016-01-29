public class Solution {
    public TreeNode sortedListToBST(ListNode head) {
        int length = 0;
        ListNode node = head;
        while(node!=null){
            node = node.next;
            length++;
        }
        return sortedListToBST(head, length);
    }
    
    private TreeNode sortedListToBST(ListNode head, int length){
        if(length == 0  head == null){
            return null;
        }else if(length == 1){
            return new TreeNode(head.val);
        }

        ListNode peak = head;
        int index = (int)(length2);
        for(int i = 0; iindex; i++){
            peak = peak.next;
        }
        
        TreeNode node = new TreeNode(peak.val);
        node.left = sortedListToBST(head, index);
        node.right = sortedListToBST(peak.next, length - index - 1);
        
        return node;
    }
}
