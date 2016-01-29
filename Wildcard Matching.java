public class Solution {
    public boolean isMatch(String s, String p) 
    {
        int n=s.length();
        int m=p.length();
    
        int i=0;
        int j=0;
        int star=-1;
        int sp=0;
        
        while(i<n)
        {
            while(j<m && p.charAt(j)=='*')
            {
                star=j++;  //* match 0 character
                sp=i;
            }
            
            if(j==m || (p.charAt(j)!=s.charAt(i) && p.charAt(j)!='?'))
            {
                if(star<0)
                    return false;
                else
                {
                    j=star+1;
                    i=++sp;     //* match 1 character
                }
            }
            else
            {
                i++;
                j++;
            }
        }
        
        while(j<m && p.charAt(j)=='*') j++;
        return j==m;
    }
}
