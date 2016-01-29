public class Solution {
    public int removeDuplicates(int[] A) {
        if(A.length ==0) return 0;
        int num=1,i;
        for(i=1;i<A.length;++i)
            if(A[i]!=A[i-1])
                A[num++]=A[i];  
        return num;
    }
}
