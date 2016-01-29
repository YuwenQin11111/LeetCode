public class Solution {
    public int firstMissingPositive(int[] A) {
        // Start typing your Java solution below
        // DO NOT write main() function
        Set<Integer> set = new HashSet<Integer>();
        for(int i: A)
            set.add(i);
        int i = 1;
        for(; i<=A.length;i++) 
            if(!set.contains(i)) return i;
        return i;
    }
}
