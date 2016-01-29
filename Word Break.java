import java.io.*;
import java.util.*;

class ListNode 
{
	int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class Solution {
	public ArrayList<String> wordBreak(String s, Set<String> dict) {
        ArrayList<String> ret_list =new ArrayList<String>();
        if (s.length() ==0)
        	return ret_list;
        
        for (int j=1; j<=s.length(); j++)
        {
        	String word =s.substring(s.length()-j,s.length());
        	if (j ==s.length() &&dict.contains(word))
        	{
        		ret_list.add(word);
        		return ret_list;
        		
        	}
        	if (dict.contains(word))
        	{
        		ArrayList<String> sub_list =wordBreak(s.substring(0, s.length()-j), dict);
        		for (int i=0;i<sub_list.size();i++)
        		{

        			ret_list.add(sub_list.get(i)+" "+word);
        			
        		}
        	}
        		
        }
        
        return ret_list;
    }
	
   public static void main(String args[])
   {
    	Solution sol =new Solution();
    	Set<String> set=new HashSet<String>();
    	set.add("a");
    	set.add("b");
    	set.add("bbb");
    	set.add("bbbb");
    	ArrayList<String> result =sol.wordBreak("bb", set);
    	for (int i=0;i<result.size();i++)
    	{
    		System.out.println(result);
    		
    	}
    	
   }
}
