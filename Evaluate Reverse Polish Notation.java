import java.io.*;
import java.util.Stack;

public class Solution {
    public int evalRPN(String[] tokens) {
    	if (tokens.length == 1)
    		return Integer.parseInt(tokens[0]);
    	if (tokens.length < 3)
    		return 0;
    	
        Stack<Integer> expression =new Stack<Integer>();
        int one =Integer.parseInt(tokens[0]);
        int two =Integer.parseInt(tokens[1]);
        expression.push(one);
        expression.push(two);
        int tokenIndex =2;
        
        while (tokenIndex <tokens.length)
        {
        	
        	String nextToken =tokens[tokenIndex++];
        	int nextNum;
        	if ((nextToken.equals("-"))||(nextToken.equals("+")) ||(nextToken.equals("/"))||(nextToken.equals("*")))
        	{
        		int secondOp =expression.pop();
        		int firstOp =expression.pop();
        		if (nextToken.equals("-"))
        			nextNum =firstOp -secondOp;
        		else if (nextToken.equals("+"))
        			nextNum =firstOp +secondOp;
        		else if (nextToken.equals("*"))
        			nextNum =firstOp * secondOp;
        		else
        		{
        			if (secondOp !=0)
        				nextNum =firstOp /secondOp;
        			else
        				nextNum =Integer.MIN_VALUE;
        		}
        	}
        	else
        	{
        		nextNum =Integer.parseInt(nextToken);
        	
        	}
        	expression.push(nextNum);
        	
        }
        return expression.pop();
    }
    
    public static void main(String args[])
    {
    	Solution sol =new Solution();
    	String[] tokens ={"0", "3", "/"};
    	int result =sol.evalRPN(tokens);
    	System.out.println(result);
    	
    }
}
