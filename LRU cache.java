public class LRUCache {
	class ListNode {
		int key;
	    int val;
	    ListNode next;
	    ListNode prev;
	    ListNode(int x,int y) {
	    	key = x;
	        val = y;
	        next = null;
	    }
	}
	
	public ListNode head;
	public ListNode tail;
	public HashMap<Integer, ListNode> map =new HashMap<Integer,ListNode>();
	public int cap =0;
	public LRUCache(int capacity) {
        head =null;
        cap =capacity;
    }
    
    public int get(int key) {
        ListNode node =map.get(key);
        if (node ==null)
        	return -1;
        
        if (node.key ==head.key)
        	return node.val;
        
        if (node.key ==tail.key)
        {	
        	tail =node.prev;
        	head.prev =node;
        	node.next =head;
        	head =node;
        	return node.val;
        }
        else
        {
        	node.prev.next =node.next;
        	node.next.prev =node.prev;
        	head.prev =node;
        	node.next =head;
        	head =node;
        	return node.val;
        }
        
    }
    
    public void set(int key, int value) {
    	int val =get(key);
    	if (val !=-1)
    	{
    		head.val =value;
    		map.remove(key);
    		map.put(key, head);
    		return;
    	}
    	if (map.size() ==0)
    	{
    		ListNode node =new ListNode(key,value);
    		map.put(key, node);
    		head =node;
    		tail =node;
    		return;
    	}
    	ListNode node =new ListNode(key,value);
    	map.put(key, node);
    	node.next =head;
    	head.prev =node;
    	head =node;
    	if (map.size() >cap)
    	{
    		map.remove(tail.key);
    		tail =tail.prev;
    	}
    }
}
