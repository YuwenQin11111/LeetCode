public class Solution {
    public ArrayList<ArrayList<Integer>> subsetsWithDup(int[] num) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> tmp = new ArrayList<Integer>();
        Arrays.sort(num);
        sub(num, 0, tmp, ans);
        return ans;        
    }
     
    public void sub(int[] num, int k, ArrayList<Integer> tmp, ArrayList<ArrayList<Integer>> ans) {
        ArrayList<Integer> arr = new ArrayList<Integer>(tmp);            
        ans.add(arr);       
         
        for (int i = k; i < num.length; i++) {
            if (i != k && num[i] == num[i-1]) continue;
             
            tmp.add(num[i]);
            sub(num, i+1, tmp, ans);
            tmp.remove(tmp.size()-1);
        }
    }
}
