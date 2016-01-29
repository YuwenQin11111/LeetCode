public class Solution {
public void solve(char[][] board) 
	{
        int width =board[0].length;
        int height =board.length;
        Queue<Integer> q =new LinkedList<Integer>();
        boolean visited[][] =new boolean[height][width];
        
        for (int h =0;h<height;h++)
        {
        	int index =h*width+0;
        	if (board[h][0] =='O')
        	{
        		q.add(index);
        	}
        		
        	index =h*width+width-1;
        	if (board[h][width-1] =='O')
        		q.add(index);
        }
        
        for (int w =0;w<width;w++)
        {
        	int index =w;
        	if (board[0][w] =='O')
        	{
        		q.add(index);
        	}
        	
        	index =(height-1)*width+w;
        	if (board[height-1][w] =='O')
        	{
        		q.add(index);
        	}
        }
        
        while (!q.isEmpty())
        {
        	int index =q.peek();
        	int h =index/width;
        	int w =index%width;
        	visited[h][w] =true;
        	
        	if (h-1>=0)
        	{
        		if (board[h-1][w] =='O' && visited[h-1][w] ==false)
        			q.add(index-width);
        	}
        	if (h+1 <height)
        	{
        		if (board[h+1][w] =='O' && visited[h+1][w] ==false)
        			q.add(index+width);
        	}
        	if (w-1>=0)
        	{
        		if (board[h][w-1] =='O' && visited[h][w-1] ==false)
        			q.add(index-1);
        	}
        	if (w+1<width)
        	{
        		if (board[h][w+1] =='O' && visited[h][w+1] ==false)
        			q.add(index+1);
        	}
        }
        

        for (int i=0;i<height;i++)
        {
        	for (int j=0;j<width;j++)
        	{
        		if (visited[i][j])
        			board[i][j] ='O';
        		else
        			board[i][j] ='X';
        	}
        }
        
        
    }

}
