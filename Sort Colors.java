public class Solution {
    public void sortColors(int[] A) {
        if (A.length ==0)
            return;
            
        int i=0;
        int j=0;
        int k=0;
        for (int l=0;l<A.length;l++)
        {
            if (A[l] ==0)
            {
                A[k++] =2;
                A[j++] =1;
                A[i++] =0;
            }
            
            else if (A[l] ==1)
            {
                A[k++] =2;
                A[j++] =1;
            }
            
            else if (A[l] ==2)
            {
                A[k++] =2;
            }
        }
        
    }

}
