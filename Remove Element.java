public class Solution {
    public int removeElement(int[] A, int elem) {
        int num=0,i;
        for(i=0;i<A.length;++i)
            if(A[i]!=elem)A[num++]=A[i];
        return num;
    }
}
